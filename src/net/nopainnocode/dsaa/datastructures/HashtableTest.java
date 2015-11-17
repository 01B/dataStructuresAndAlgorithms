package net.nopainnocode.dsaa.datastructures;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by no_pain_no_code on 2015. 11. 17..
 */
public class HashtableTest {
    private Hashtable hashtable = new Hashtable();

    public Hashtable getHashtable() { return this.hashtable; }

    public void putTestValues() {

        // Hashtable은 null 값 허용안함
        //this.hashtable.put(null, null);
        this.hashtable.put("a","aaa");
        this.hashtable.put("b","bbb");
        this.hashtable.put("c","ccc");
        this.hashtable.put("d","ddd");
        this.hashtable.put("f","fff");

        this.hashtable.put("a", "에이");
        this.hashtable.put("b", "비");
    }

    public static void main(String[] args) {

        HashtableTest hashtableTest = new HashtableTest();

        hashtableTest.putTestValues();

        Hashtable hashtable = hashtableTest.getHashtable();
        Iterator iter = hashtable.keySet().iterator();

        while(iter.hasNext()) {

            Object key = iter.next();
            Object value = hashtable.get(key);
            System.out.printf("key : " + key + " value : " + value + "\n");
        }
    }
}
