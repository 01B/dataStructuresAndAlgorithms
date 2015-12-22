package net.nopainnocode.dsaa.algorithms.test;

/**
 * Created by no_pain_no_code on 2015. 12. 20..
 */

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * https://projecteuler.net/problem=1
 */
public class SumOfMultiples {

    public static void main(String[] args) {

        // Just use inclusion-exclusion to get the final sum
        int total = doMultiply(3) + doMultiply(5)
                - doMultiply(3 * 5);

        System.out.println(total);
    }

    private static int doMultiply(int intvalue) {
        int quotient = 1000 / intvalue;
        return intvalue * quotient * (quotient + 1) / 2;
    }
}
