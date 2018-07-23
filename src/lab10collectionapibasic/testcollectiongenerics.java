package lab10collectionapibasic;

import java.util.*;

public class testcollectiongenerics {
    public static void main(String[] args) {


        testList();
        testSet();
        testMap();

    }


    private static void testList() {

        System.out.println("=====List : Generics =====");
        // SupperClass<Type Value>  = subclass<>();  = polymorphism
        // Generics <String>
        List<String> l = new ArrayList<>();
        l.add("cat1");
        l.add("cat2");
        l.add("cat3");
        l.add("cat2");
        // Generics <Integer>
       List<Integer> lInt = new ArrayList<>();
        lInt.add(1);
        lInt.add(2);
        lInt.add(3);

        System.out.println("=== Ex1. Values String=== ");
        for (String lList : l  ) {
            System.out.println(lList);
        }
        System.out.println("=== Ex2. Values Integer=== ");
        for ( int lList2 : lInt) {
            System.out.println(lList2);

        }

    }

    private static void testSet() {
        System.out.println("=====Set : Generics =====");

        Set<String> s = new HashSet<>();
        s.add("dog 1");
        s.add("dog 2");
        s.add("dog 3");

        s.add("dog 2");
        System.out.println("=== Values === ");
        for (String sSet : s) {
            System.out.println(sSet);
        }

    }

    private static void testMap() {

        System.out.println("=====Map : Generics =====");

        Map<String, String> partList = new TreeMap<>();
        partList.put("k1", "Blue Polo Shirt");
        partList.put("k2", "Black Polo Shirt");
        partList.put("k3", "Duke Hat");

        partList.put("k2", "Black T-Shirt");
        Set<String> keys = partList.keySet();

        System.out.println("=== Key / Values === ");
        for (String key : keys) {
            System.out.println("Part#" + key + "" + partList.get(key));
        }
    }
}