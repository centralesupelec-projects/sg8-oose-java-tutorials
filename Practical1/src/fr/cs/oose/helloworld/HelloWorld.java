package fr.cs.oose.helloworld;

import java.util.Scanner;
import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
        // Question 3
        System.out.println("Hello World");

        // Question 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.nextLine();
        System.out.println(s);

        // Question 5
        System.out.println(Math.PI);

        // Question 6
        System.out.println("Enter an integer num: ");
        int i = sc.nextInt();
        Random randomNumbers = new Random();
        int randomValue = randomNumbers.nextInt(i) + 1;
        System.out.println("Result is: " + randomValue);
    }
}
