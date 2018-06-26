package net.nopainnocode.dsaa.algorithms.examples;

import java.util.Scanner;

/**
 * Created by no.pain.no.code@gmail.com
 * nopainnocode.tistory.com
 */
public class CalculateNumberOfOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] num = new int[N];

        // 다음 for 문의 연산횟수는 N
        for (int i = 0; i < N; i++)
            num[i] = sc.nextInt();

        int answer = -1;
        // 다음 for 문의 연산횟수는 최소 1, 최대 N
        for (int i = 0; i < N; i++) {
            if (num[i] == M) {
                answer = i;
                break;
            }
        }

        /*
            총 연산횟수는 최소 N + 1, 최대 2N
         */
        System.out.println(answer);
    }
}
