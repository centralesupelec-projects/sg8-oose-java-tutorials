package fr.cs.oose.pr9.factorial;

public class Factorial {
    public int max_value = 12;
    public int value;

    public Factorial(int n) throws Exception {
        if (n <= this.max_value) {
            this.value = n;
        }
        else {
            throw new Exception("The value should be 12 or less");
        }
    }

    public int compute() {
        int result = 1;
        for (int i = 1; i <= this.value; i++) {
            result *= i;
        }
        return result;
    }
}
