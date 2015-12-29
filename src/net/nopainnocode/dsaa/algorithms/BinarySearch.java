package net.nopainnocode.dsaa.algorithms;

/**
 * Created by no_pain_no_code on 2015. 11. 27..
 */
public class BinarySearch {

    /**
     * binary search 를 합니다.
     * @param arr 검색 배열
     * @param val 검색하고자 하는 값
     * @param i 검색 시작 index
     * @param j 검색 끝 index
     * @return 값의 index
     */
    public static int doBinarySearch(int[] arr, int val, int i, int j) {

        int midIndex = (i + j)/2;
        int midVal = arr[midIndex];

        if(val > midVal)
            return doBinarySearch(arr, val, midIndex, j);
        else if(val < midVal)
            return doBinarySearch(arr, val, i, midIndex);
        else
            return midIndex;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{2, 5, 8, 20, 45, 100};
        System.out.println(doBinarySearch(arr, 45, 0, arr.length - 1));
    }
}
