package net.nopainnocode.dsaa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.printf("Enter the N value : ");
        int n = new Scanner(System.in).nextInt();

        System.out.printf("The factorial value of "+ n + " is " + doFactorial(n));
    }

    public static int doFactorial(int i) {

        if (1 == i)
            return 1;
        else
            return i * doFactorial(--i);
    }

}


