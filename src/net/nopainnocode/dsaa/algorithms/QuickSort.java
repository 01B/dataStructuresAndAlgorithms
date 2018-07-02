package net.nopainnocode.dsaa.algorithms;

/**
 * Created by no_pain_no_code on 2015. 12. 29..
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] dataArray = new int[]{3, 54, 2, 6, 5, 13, 8, 54, 45, 23, 7, 5, 9, 10};

        doQuickSort(dataArray, 0, dataArray.length - 1);

        System.out.println(dataArray);
    }

    private static void doQuickSort(int[] dataArray, int left, int right) {

        int i = left;
        int j = right;
        int temp;
        int midValue = dataArray[(left + right) / 2];

        while (i <= j) {

            while (dataArray[i] < midValue)
                i++;
            while (dataArray[j] > midValue)
                j--;

            if (i <= j) {
                temp = dataArray[i];
                dataArray[i] = dataArray[j];
                dataArray[j] = temp;
                i++;
                j--;
            }
        }

        if (j > left) doQuickSort(dataArray, left, j);
        if (i < right) doQuickSort(dataArray, i, right);
    }
}