/**
 * 
 */
package ch.demo.web;

import java.io.Serializable;

/**
 * Models a security badge.
 * 
 * @author hostettler
 */
public class Badge implements Serializable {

    /** The serial-id. */
    private static final long serialVersionUID = 3064609886266854069L;

    /** The unique id. */
    private Long id;

    /** The student's security level. */
    private Long securityLevel;

    /** The student that owns this badge. */
    private StudentFullDTO student;

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

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the securityLevel
     */
    public Long getSecurityLevel() {
        return securityLevel;
    }

    /**
     * @param securityLevel
     *            the securityLevel to set
     */
    public void setSecurityLevel(final Long pSecurityLevel) {
        this.securityLevel = pSecurityLevel;
    }

}
