package net.nopainnocode.dsaa.algorithms;

/**
 * Created by no_pain_no_code on 2015. 11. 27..
 */
public class BinarySearch {

    public static int binarySearch(int[] intArray, int intValue, int temp) {

        // 중간 인덱스로부터 값을 불러와 앞을 탐색할지 뒤를 탐색할지 결정한다
        int middleIndex = (intArray.length - 1) / 2;
        int middleValue = intArray[middleIndex];
        int sizeOfTempArray = intArray.length % 2 == 0 ? middleIndex + 1 : middleIndex;

        int[] intArrayTemp = new int[sizeOfTempArray];

        if (intValue == middleValue)
            return temp + sizeOfTempArray;

        if(intValue > middleValue)
            System.arraycopy(intArray, middleIndex+1,intArrayTemp,0,sizeOfTempArray);
        else
            System.arraycopy(intArray, 0,intArrayTemp,0,sizeOfTempArray - 1);

        return binarySearch(intArrayTemp, intValue, middleIndex);
    }

    public static void main(String[] args) {

        int[] intArray = new int[]{2, 5, 8, 20, 45, 100};
        System.out.println(binarySearch(intArray, 45, 0));
    }
}
