package lab11collectionapibasic2.labMap;

import java.util.*;

public class TestCollecttionMap {
    public static void main(String[] args) {
        Map<String, Custommer> mymap = new HashMap();
        mymap.put("123", new Custommer("123", "Jack", "Jack@gmail.com"));
        mymap.put("124", new Custommer("124", "Jack2", "Jack2@gmail.com"));
        mymap.put("125", new Custommer("125", "Jack3", "Jack3@gmail.com"));
        mymap.put("123", new Custommer("126", "Jack4", "Jack4@gmail.com"));
        System.out.println(mymap);
        Custommer c = mymap.get("123");

        System.out.println("-----------------------------------");

        System.out.println(c.getId());
        System.out.println(c.getName());
        System.out.println(c.getAddress());

        System.out.println("------------fore-----------------");

        for (String key : mymap.keySet()) {
            System.out.println("Key = " + key);
            Custommer c1 = mymap.get(key);
            System.out.println("ID = " + c1.getId());
            System.out.println("Name = " + c1.getName());
            System.out.println("Email = " + c1.getAddress());
            System.out.println("-----------------------------------");
        }
        System.out.println("-------------fore Collection--------------");
        Collection<Custommer> allCusts =  mymap.values();
        for (Custommer c2 : allCusts) {
            System.out.println(c2.getId());
            System.out.println(c2.getName());
            System.out.println("------------------------------------");
        }
        
        System.out.println("-------------fore set/map-------------");
       Set<Map.Entry<String,Custommer>> s =  mymap.entrySet();
        for (Map.Entry<String, Custommer> entry : s ) {
            Custommer c3 = entry.getValue();
            System.out.println(c3.getName());

        }
    }
}
