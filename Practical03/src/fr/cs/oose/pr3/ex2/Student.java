package fr.cs.oose.pr3.ex2;

public class Student extends User {
    private String program;
    private MarkSplit markSplit;

    public Student(String firstname, String lastname, String username, String program, float ME_mark, float FE_mark, float PW_mark) {
        super(firstname, lastname, username);

        if (program.equals("MSC") || program.equals("UG") || program.equals("PHD")) {
            this.program = program;
        } else {
            System.out.println("Program should be MSC or UG or PHD");
        }

        setMarkSplit(ME_mark, FE_mark, PW_mark);
    }

    public String getProgram() {
        return program;
    }

    public MarkSplit getMarkSplit() {
        return markSplit;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setMarkSplit(float ME_mark, float FE_mark, float PW_mark) {
        this.markSplit = new MarkSplit(FE_mark, ME_mark, PW_mark);
    }

    public String toString() {
        return "Student [user=" + super.toString() + ", program=" + program + ", markSplit=" + markSplit.toString() + "]";
    }
}
