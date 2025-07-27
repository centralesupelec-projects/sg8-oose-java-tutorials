package fr.cs.oose.pr9.factorial;

public class FactorialTest {
    public static void main(String[] args) {
        try {
            System.out.println("Input value is 2. Factorial is:");
            Factorial f1 = new Factorial(2);
            System.out.println(f1.compute());

            System.out.println("Input value is 4. Factorial is:");
            Factorial f2 = new Factorial(4);
            System.out.println(f2.compute());

            System.out.println("Input value is 5. Factorial is:");
            Factorial f3 = new Factorial(5);
            System.out.println(f3.compute());

            System.out.println("Input value is 10. Factorial is:");
            Factorial f4 = new Factorial(10);
            System.out.println(f4.compute());

            System.out.println("Input value is 13. Factorial is:");
            Factorial f5 = new Factorial(13);
            System.out.println(f5.compute());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
