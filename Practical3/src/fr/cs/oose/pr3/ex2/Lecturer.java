package fr.cs.oose.pr3.ex2;

import java.util.HashSet;
import java.util.Set;

public class Lecturer extends User {
    private Set<Module> classes;

    public Lecturer(String firstname, String lastname, String username) {
        super(firstname, lastname, username);
        this.classes = new HashSet<>();
    }

    public Set<Module> getClasses() {
        return classes;
    }

    public void setClasses(Set<Module> classes) {
        this.classes = classes;
    }

    public void addClass(Module module) {
        this.classes.add(module);
        module.setLecturer(this);
    }

    public void removeClass(Module module) {
        this.classes.remove(module);
    }

    public void finalMarks(Module m) {
        Set<Student> students = m.getStudents();
        for (Student s : students) {
            System.out.println("***");
            System.out.println(s.toString());
            System.out.println("Final Mark: " + m.finalMark(s));
            System.out.println("Passed: " + m.hasPassed(s));
        }
    }

    public String toString() {
        return "Lecturer [user=" + super.toString() + "]";
    }
}
