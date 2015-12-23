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

    /**
     * 1 부터 숫자 n 까지의 합은 n * (n +1) / 2 인 점을 이용하여 각 배수들의 합을 구한다.
     * @param intValue
     * @return
     */
    private static int doMultiply(int intValue) {
        int quotient = 1000 / intValue;
        return intValue * quotient * (quotient + 1) / 2;
    }
}
