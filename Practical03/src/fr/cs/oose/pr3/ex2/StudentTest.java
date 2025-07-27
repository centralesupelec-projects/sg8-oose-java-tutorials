package fr.cs.oose.pr3.ex2;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Frusciante", "jfrusc", "MSC", 12, 14, 8);
        Student student2 = new Student("Chris", "Cornell", "ccorn", "MSC", 2, 13, 12);
        Student student3 = new Student("Perry", "Farrel", "pfarr", "UG", 2, 13, 12);

        System.out.println("Student 1");
        System.out.println(student1);

        System.out.println("Student 2");
        System.out.println(student2);

        System.out.println("Student 3");
        System.out.println(student3);
    }
}
