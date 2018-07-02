package net.nopainnocode.dsaa.algorithms;

import java.util.Scanner;

/**
 * Created by no.pain.no.code@gmail.com
 * nopainnocode.tistory.com
 */
public class FibonacciSequence {

    public static void main(String[] args) {
        System.out.println("몇 번째 피보나치 수열을 구할 것인가?");
        System.out.println(
//                fibonacci(new Scanner(System.in).nextInt())
                fibonacciLoop(new Scanner(System.in).nextInt())
        );
    }

    /**
     * 재귀호출로 구하는 방법
     * O(2^N)의 시간복잡도.
     */
    private static int fibonacci(int N) {
        if(N <= 2) return 1;
        return fibonacci(N - 1) + fibonacci(N - 2);
    }

    /**
     * Loop 문으로 구하는 방법
     * O(N)의 시간 복잡도
     */
    private static int fibonacciLoop(int N) {
        int a = 1, b = 1, c = 1;
        for(int i = 3; i <= N; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    /**
     * 행렬을 이용하는 방법
     * O(log(N)) 의 시간 복잡도
     */
    fibonacciMatrix(int N) {

        a = {{1, 1}, {1, 0}};
        result = {{1,1}, {1,0}};
        while (N > 0) {
            if(N == 1) {
                result = a;
                break;
            }
            else if(N % 2 == 1)
                result = a * a;
            else
                result = result * a;

            N = N/2;
        }
    }
}
