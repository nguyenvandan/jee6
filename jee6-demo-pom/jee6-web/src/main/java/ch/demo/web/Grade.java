package ch.demo.web;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Represents a grade for a given discipline.
 * 
 * @author hostettler
 */


public class Grade implements Serializable {

	/** The serial-id. */
	private static final long serialVersionUID = -1369317473509616839L;

	/** The unique id. */
	private long id;

	/** The discipline of this grade. */
	private Discipline discipline;

	/** The actual grade. */
	private Integer grade;

	/** The student that has obtained this grade. */
	private StudentFullDTO student;

	/**
	 * Constructor that builds a grade for a given discipline.
	 * 
	 * @param discipline
	 *            to grade.
	 */
	public Grade(final Discipline discipline) {
		setDiscipline(discipline);
	}

	/**
	 * Constructor that builds a grade for a given discipline.
	 * 
	 * @param discipline
	 *            to grade.
	 * @param grade
	 *            the actual grade.
	 */
	public Grade(final Discipline discipline, final Integer grade) {
		this(discipline);
		this.setGrade(grade);
	}

	/**
	 * Constructor that builds a grade for a given discipline.
	 * 
	 */
	public Grade() {
	}

	/**
	 * @return the discipline
	 */
	public final Discipline getDiscipline() {
		return discipline;
	}

	/**
	 * @param discipline
	 *            to set
	 */
	public final void setDiscipline(final Discipline pDiscipline) {
		this.discipline = pDiscipline;
	}

	/**
	 * @return the grade
	 */
	public final Integer getGrade() {
		return grade;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public final void setGrade(final Integer pGrade) {
		this.grade = pGrade;
	}

	/**
	 * @return the id
	 */
	public final long getId() {
		return id;
	}

	/**
	 * @return the student
	 */
	public StudentFullDTO getStudentFullDTO() {
		return student;
	}

	/**
	 * @param student
	 *            the student to set
	 */
	public void setStudentFullDTO(final StudentFullDTO pStudent) {
		this.student = pStudent;
	}

}
