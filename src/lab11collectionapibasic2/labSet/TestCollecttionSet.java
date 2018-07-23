package lab11collectionapibasic2.labSet;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class TestCollecttionSet {
    public static void main(String[] args) {
        Set<String> mys = new HashSet();
        mys.add("hello");
        mys.add("world");
        mys.add("how");
        mys.add("are");
        mys.add("hello");

        for (String my : mys) {
            System.out.println(my);
        }
        System.out.println("==========================================");
        String[] strs = mys.toArray(new String[0]);

        for (String str : strs) {
            System.out.println(str);
        }
        System.out.println("==========================================");
        System.out.println(strs[2]);
        System.out.println("Size = " + mys.size());
        System.out.println("Size = " + mys);
        mys.clear();
        System.out.println("Size = " + mys.size());
        System.out.println("Size = " + mys);

        System.out.println("-----------#######----------");

        Set<Custommer> mycus = new HashSet();
        mycus.add(new Custommer("1", "top", "top@gg"));
        mycus.add(new Custommer("2", "tap", "tap@gg"));
        mycus.add(new Custommer("3", "tup", "tup@gg"));


        for (Custommer c1 : mycus) {

            System.out.println(c1.getId());
            System.out.println(c1.getName());
            System.out.println(c1.getAddress());
            System.out.println("---------------------------");

        }

    }
}
