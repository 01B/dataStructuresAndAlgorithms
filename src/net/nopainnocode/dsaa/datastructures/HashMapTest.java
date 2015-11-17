package net.nopainnocode.dsaa.datastructures;

import java.util.*;

/**
 * Created by no_pain_no_code on 2015. 11. 15..
 */
public class HashMapTest {

    private Map hashMap = new HashMap();

    public Map getHashMap(){
        return this.hashMap;
    }

    public int putTestData() {

        this.hashMap.put(null, null);
        this.hashMap.put(1, "b");
        this.hashMap.put(2, "c");
        this.hashMap.put(3, "d");
        this.hashMap.put(1, "d");
        this.hashMap.put(4, "d");

        return this.hashMap.size();
    }

    public Object getReturnValueOfPuttingExistKeyValue() {

        return this.hashMap.put(1, "e");
    }

    public static void main(String[] args) {

        HashMapTest hashMapTest = new HashMapTest();
        System.out.printf("The size of the HashMap is "
                + hashMapTest.putTestData() + "\n");

        // return the before value
        System.out.printf("The return value of putting exist key value is "
                + hashMapTest.getReturnValueOfPuttingExistKeyValue() + "\n");

        Iterator iter = hashMapTest.getHashMap().keySet().iterator();

        while(iter.hasNext()) {

            Object key = iter.next();
            Object value = hashMapTest.getHashMap().get(key);

            System.out.printf("key : " + key + " value : " + value + "\n");
        }
    }

}
