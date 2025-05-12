package fr.cs.oose.pr3.ex1;

public class BloodTest {
    public static void main(String[] args) {
        Patient mary= new Patient("Mary");
        mary.addBlood_measure(new Blood(94,61, new Date(2,5,2013)));
        mary.addBlood_measure(new Blood(97,65, new Date(3,5,2013)));
        mary.addBlood_measure(new Blood(144,99, new Date(4,5,2013)));
        mary.addBlood_measure(new Blood(123,88, new Date(5,5,2013)));
        mary.addBlood_measure(new Blood(177,110, new Date(6,5,2013)));
        mary.addBlood_measure(new Blood(145,89, new Date(7,5,2013)));
        System.out.println(mary);
        mary.printReport();

        Patient john= new Patient("John");
        john.addBlood_measure(new Blood(88,57, new Date(15,5,2013)));
        john.addBlood_measure(new Blood(95,61, new Date(16,5,2013)));
        john.addBlood_measure(new Blood(114,80, new Date(17,5,2013)));
        john.addBlood_measure(new Blood(151,96, new Date(18,5,2013)));
        john.addBlood_measure(new Blood(176,104, new Date(19,5,2013)));
        john.addBlood_measure(new Blood(176,110, new Date(20,5,2013)));
        System.out.println(john);
        john.printReport();
    }
}
