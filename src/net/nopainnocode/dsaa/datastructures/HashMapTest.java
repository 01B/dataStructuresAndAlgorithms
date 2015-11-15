package net.nopainnocode.dsaa.datastructures;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by no_pain_no_code on 2015. 11. 15..
 */
public class HashMapTest {

    private Map hashMap = new HashMap();

    public int addDefaultData(){

        this.hashMap.put(1,"a");
        this.hashMap.put(2,"b");
        this.hashMap.put(3,"c");
        this.hashMap.put(1,"d");
        this.hashMap.put(2,"d");
        this.hashMap.put(4,"d");

        return this.hashMap.size();
    }

    public void testPrintTheReturnValue() {

        System.out.printf("The return value of adding redundant key value is "
                + this.hashMap.put(1, "e"));
    }
}
