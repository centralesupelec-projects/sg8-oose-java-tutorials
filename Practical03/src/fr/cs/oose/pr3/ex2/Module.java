package fr.cs.oose.pr3.ex2;

import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;

public class Module {
    private String name;
    private String code;
    private Lecturer lecturer;
    private Set<Student> students;
    private Map<String, MarkSplit> weights;
    private Map<String, Integer> pass_mark;

    public Module(String name, String code) {
        this.name = name;
        this.code = code;
        this.students = new HashSet<Student>();
        this.weights = new HashMap<String, MarkSplit>();
        this.pass_mark = new HashMap<String, Integer>();
    }

    public Module(String name, String code, Map<String, MarkSplit> weights, Map<String, Integer> pass_mark) {
        this.name = name;
        this.code = code;
        this.weights = weights;
        this.pass_mark = pass_mark;
        this.students = new HashSet<Student>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addStudents(Set<Student> students) {
        this.students.addAll(students);
    }

    public Set<Student> getStudents() {
        return this.students;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public int finalMark(Student student) {
        int finalMark = 0;
        if (student.getProgram().equals("UG")) {
            MarkSplit UG_weights = this.weights.get("UG");
            try { UG_weights.CheckWeightSum(); } catch (IncorrectWeightsException e) {e.printStackTrace();}
            finalMark = (int) Math.round(
                    UG_weights.getFE_mark()*student.getMarkSplit().getFE_mark()
                            + UG_weights.getME_mark()*student.getMarkSplit().getME_mark()
                            + UG_weights.getPW_mark()*student.getMarkSplit().getPW_mark()
            );
        }
        else if (student.getProgram().equals("MSC")) {
            MarkSplit MSC_weights = this.weights.get("MSC");
            try { MSC_weights.CheckWeightSum(); } catch (IncorrectWeightsException e) {e.printStackTrace();}
            finalMark = (int) Math.round(
                    MSC_weights.getFE_mark()*student.getMarkSplit().getFE_mark()
                            + MSC_weights.getME_mark()*student.getMarkSplit().getME_mark()
                            + MSC_weights.getPW_mark()*student.getMarkSplit().getPW_mark()
            );
        }
        return finalMark;
    }

    public boolean hasPassed(Student student) {
        boolean passed = false;
        if (student.getProgram().equals("UG") && this.finalMark(student) > this.pass_mark.get("UG")) {
            passed = true;
        }
        else if (student.getProgram().equals("MSC") && this.finalMark(student) > this.pass_mark.get("MSC")) {
            passed = true;
        }
        else if (student.getProgram().equals("PHD")) {
            // PhD student does not have final mark
            passed = true;
        }
        return passed;
    }

    public String toString() {
        String s =  "** Module " + name + " " + code + "\n";
        s += "--> Taught by: " + lecturer.toString() + "\n";
        s += "--> Total students: " + students.size() + "\n";
        StringBuilder student_list = new StringBuilder();
        for (Student student : students) {
            student_list.append("\t");
            student_list.append("* ");
            student_list.append(student.toString());
            student_list.append("\n");
        }
        s += student_list.toString();
        return s;
    }
}
