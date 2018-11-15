package ch.demo.web;

/**
 * Describes the discipline, the student studies.
 * 
 * @author hostettler
 */
public enum Discipline {
    /** Maths. */
    MATHEMATICS("Mathematics"),
    /** Biology. */
    BIOLOGY("Biology"),
    /** French. */
    FRENCH("French"),
    /** English. */
    ENGLISH("English"),
    /** German. */
    GERMAN("German"),
    /** History. */
    HISTORY("History"),
    /** Geography. */
    GEOGRAPHY("Geography");

    /**
     * Constructor.
     * 
     * @param name
     *            of the discipline.
     */
    private Discipline(final String pName) {
        this.name = pName;
    }

    /** The actual name of the discipline. */
    private String name;

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return this.name;
    }

}
