package net.nopainnocode.dsaa.datastructures;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by no_pain_no_code on 2015. 11. 16..
 */
public class IteratorTest {

    private HashMap hashmap = new HashMap();

    public HashMap getHashmap() { return this.hashmap; }

    public void putTestValues() {

        this.hashmap.put("a","aaa");
        this.hashmap.put("b","bbb");
        this.hashmap.put("c","ccc");
        this.hashmap.put("d","ddd");
        this.hashmap.put("f","fff");
    }

    public static void main(String[] args) {

        IteratorTest iteratorTest = new IteratorTest();

        iteratorTest.putTestValues();

        Iterator iter = iteratorTest.getHashmap().keySet().iterator();

        while(iter.hasNext()) {

            Object key = iter.next();
            Object value = iteratorTest.getHashmap().get(key);
            System.out.printf("key : " + key + " value : " + value + "\n");

            // try remove --> throw ConcurrentModificationException !!!
            iteratorTest.getHashmap().remove(key);

            // 다음과 같은 방법으로 삭제가 가능하다.
            if("a" == key )
                iter.remove();
        }
    }
}
