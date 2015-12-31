package net.nopainnocode.dsaa.algorithms.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by no_pain_no_code on 2015. 12. 30..
 */

/**
 * https://www.hackerrank.com/challenges/the-grid-search
 */
public class TheGridSearch {

    static Scanner scanner;
    static List<Integer[]> vertexStore = new ArrayList<Integer[]>();
    //static Map<Integer, Integer> vertexStore = new HashMap<Integer, Integer>();

    public static void main(String[] args) {

        try {
            scanner  = new Scanner(new File("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int testSize = scanner.nextInt();

        while(testSize>0){
            List<String> out = scan();
            List<String> in = scan();

            System.out.println(check(out, in) > 0 ? "YES" : "NO");
            testSize--;
        }
    }

    public static int check(List<String> out, List<String> in) {
        String firstStr = in.get(0);
        findMatchingVertex(out, firstStr);
        int resultCount = 0;
        for(Integer[] vertex : vertexStore){
            int row = vertex[0];
            int col = vertex[1];

            if(check(out, in, row, col))
                resultCount++;
        }

        return resultCount;
    }

    private static boolean check(List<String> out, List<String> in, int row, int col) {

        for(int j = 0;j < in.size(); j++){
            String inStr = in.get(j);
            if(row < out.size()) {
                String outStr = out.get(row++);
                if (col != outStr.indexOf(inStr,col))
                    return false;
            }
        }

        return true;
    }

    private static void findMatchingVertex(List<String> list, String str){
        for(int i=0;i<list.size();i++){
            String element = list.get(i);
            for(int j = 0; j < element.length();j++){
                int index = element.indexOf(str, j);
                if(0 <= index) {
                    Integer[] vertex = new Integer[2];
                    vertex[0] = i;
                    vertex[1] = index;
                    vertexStore.add(vertex);
                }
            }
        }
    }

    public static List<String> scan(){
        int rowCount = scanner.nextInt();
        int colCount = scanner.nextInt();
        List<String> list = new ArrayList<String>();
        fillList(list, rowCount);
        return list;
    }

    public static void fillList(List<String> list, int rowCount){

        while(rowCount > 0) {
            String line = scanner.nextLine();
            if(line !=null && !line.isEmpty()) {
                list.add(line);
                rowCount--;
            }
        }
    }
}

