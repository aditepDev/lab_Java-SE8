package lab11collectionapibasic2.labList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestCollectionList {
    public static void main(String[] args) {
        // polymorphism
        System.out.println(" ========================= List + polymorphism =========================");
        List myl = new ArrayList();
        myl.add("String");
        myl.add(12);
        myl.add(new Date());

        int s = (int) myl.get(1);
        System.out.println(s);
        System.out.println((Date) myl.get(2));

        // Generics + polymorphism
        System.out.println("========================= List + Generics + polymorphism =========================");
        List<Integer> myl2 = new ArrayList<>();
        myl2.add(12);
        myl2.add(new Integer(("11")));
        myl2.add(new Integer(66));

        for (int i : myl2) {
            System.out.println(i);

        }

        System.out.println("====================== List + Generics + polymorphism + dao =========================");

        List<Custommer> myCustomer = new ArrayList<>();
        myCustomer.add(new Custommer("123", "Jacky", "Jacky@gmail.com"));
        myCustomer.add(new Custommer("124", "Jacky2", "Jacky2@gmail.com"));
        myCustomer.add(new Custommer("125", "Jacky3", "Jacky3@gmail.com"));

        System.out.println("=============================================== select ex1 ===============================================");

        Custommer cust = myCustomer.get(2);
        System.out.println(cust.getName());
        System.out.println(cust.getAddress());
        System.out.println(cust.getId());
        System.out.println("-------------------------------------");

        System.out.println("===============================================select ex2 ===============================================");

        System.out.println("============ add index 1");

        myCustomer.add(1, new Custommer());
        printList((List<Custommer>) myCustomer);


        System.out.println("============ delete last instance");

        myCustomer.remove(myCustomer.size() - 1);
        printList((List<Custommer>) myCustomer);

        System.out.println("============ clear all customer");

        myCustomer.clear();
        printList((List<Custommer>) myCustomer);

    }

    private static void printList(List<Custommer> myCustomer) {
        for (Custommer c : myCustomer) {
            System.out.println(c.getId());
            System.out.println(c.getName());
            System.out.println(c.getAddress());
            System.out.println("-------------------------------------");
        }
    }
}

