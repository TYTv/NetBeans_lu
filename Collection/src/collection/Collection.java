/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author student
 */
public class Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        HashSet<String> myset = new HashSet<>();    // 不允許重複
        myset.add("AA");
        myset.add("BB");
        myset.add("AA");
        myset.add("CC");

        for (String s : myset) {
            System.out.println(s);
        }

        HashMap<String, String> mymap = new HashMap<>();  // KEY vs VALUE
        mymap.put("username", "John");
        mymap.put("tel", "123");

        System.out.println(mymap.get("username"));

        ArrayList<Map<String, String>> alm = new ArrayList<>();
        HashMap<String, String> hm = new HashMap<>();
        hm.put("CITY", "台北");
        hm.put("CODE", "02");
        alm.add(hm);

        hm = new HashMap<>();
        hm.put("CITY", "台中");
        hm.put("CODE", "04");
        alm.add(hm);

        hm = new HashMap<>();
        hm.put("CITY", "高雄");
        hm.put("CODE", "07");
        alm.add(hm);

        for (Map<String, String> m : alm) {
            System.out.println(m.get("CITY") + "," + m.get("CODE"));
        }

    }

}
