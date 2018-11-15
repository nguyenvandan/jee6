package ch.demo.web;

import java.io.IOException;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;

@WebServlet("/jms")
public class JMSQueueFacade extends HttpServlet {

	private static final long serialVersionUID = 1318211294294344911L;

	@Resource(mappedName = "MyConnectionFactory")
	private ConnectionFactory connectionFactory;

	@Resource(mappedName = "MyQueue")
	private Queue queue;

	@Inject
	private Logger logger;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.info("Push message to queue");

		try {
			Connection connection;
			connection = connectionFactory.createConnection();

			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			MessageProducer messageProducer = session.createProducer(queue);

			TextMessage message = session.createTextMessage();

			for (int i = 0; i < 1; i++) {
				message.setText("This is message " + (i + 1));
				messageProducer.send(message);
			}
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}
}
