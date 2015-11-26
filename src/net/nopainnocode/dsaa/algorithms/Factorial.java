package net.nopainnocode.dsaa.algorithms;

import java.util.Scanner;

/**
 * Created by no_pain_no_code on 2015. 11. 16..
 */
public class Factorial {

    public static int doFactorial(int i) {

        if (1 == i)
            return 1;
        else
            return i * doFactorial(--i);
    }

    public static void main(String[] args) {

        System.out.printf("Enter the N value : ");
        int n = new Scanner(System.in).nextInt();

        System.out.printf("The factorial value of " + n + " is " + doFactorial(n));

    }
}
