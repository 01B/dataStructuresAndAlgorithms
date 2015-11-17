package net.nopainnocode.dsaa.datastructures;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by no_pain_no_code on 2015. 11. 16..
 */
public class EnumerationTest {

    private Hashtable hashtable = new Hashtable();

    public Hashtable getHashtable() { return this.hashtable; }

    public void putTestValues() {

        this.hashtable.put("a","aaa");
        this.hashtable.put("b","bbb");
        this.hashtable.put("c","ccc");
        this.hashtable.put("d","ddd");
        this.hashtable.put("f","fff");
    }

    public static void main(String[] args) {

        EnumerationTest enumerationTest = new EnumerationTest();

        enumerationTest.putTestValues();

        Enumeration keyEnumeration = enumerationTest.getHashtable().keys();

        while(keyEnumeration.hasMoreElements()) {

            Object key = keyEnumeration.nextElement();
            Object value = enumerationTest.getHashtable().get(key);
            System.out.printf("key : " + key + " value : " + value + "\n");

            // try remove : Exception 없음
            enumerationTest.getHashtable().remove(key);
        }
    }
}
