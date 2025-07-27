package fr.cs.oose.pr3.ex2;

import java.util.HashMap;
import java.util.Map;

public class CompleteTest {
    public static void main(String[] args) {
        Lecturer paolo = new Lecturer("Paolo", "Ballarini", "paolob");

        Map<String, MarkSplit> weights = new HashMap<>(
                Map.of(
                        "UG", new MarkSplit(0.7F, 0, 0.3F),
                        "MSC", new MarkSplit(0.2F, 0.6F, 0.2F)
                )
        );
        Map<String, Integer> pass_mark = new HashMap<>(
                Map.of("UG", 8, "MSC", 10)
        );

        Module m = new Module("Advanced programming", "IS1220", weights, pass_mark);
        paolo.addClass(m);

        Student student1 = new Student("John", "Frusciante", "jfrusc", "MSC", 12, 14, 8);
        Student student2 = new Student("Chris", "Cornell", "ccorn", "MSC", 2, 13, 12);
        Student student3 = new Student("Perry", "Farrel", "pfarr", "UG", 2, 13, 12);

        m.addStudent(student1);
        m.addStudent(student2);
        m.addStudent(student3);

        System.out.println(m);
        paolo.finalMarks(m);
    }
}
