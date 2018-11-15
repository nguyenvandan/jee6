package ch.demo.business.service;

import javax.ejb.MessageDriven;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@MessageDriven(mappedName = "MyQueue")
@TransactionManagement(TransactionManagementType.BEAN)
public class StudentRegistrationService implements MessageListener {

	@PersistenceContext
	EntityManager em;
	
	public void onMessage(Message inMessage) {
	      TextMessage msg = null;

	      em.getTransaction().begin();

	      try {
	          msg = (TextMessage) inMessage;
	          System.out.println("MESSAGE BEAN: Message received: " + msg.getText());
	          System.out.println(Thread.currentThread().getName());
	      } catch (JMSException e) {
	          em.getTransaction().rollback();
	      }
	      em.getTransaction().commit();
	  }
}
