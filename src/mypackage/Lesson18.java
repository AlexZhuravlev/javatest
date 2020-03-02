package mypackage;

import java.util.ArrayList;
import java.util.List;

public class Lesson18 {
    public static void main(String[] args) {

        // int[] array = new int[3]; - casual array

        //list == dynamical array
        //add, get, set, remove, size, clear, addAll, removeAll, isEmpty, contains, containsAll

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(9);

        int a = list.get(2);

        System.out.println(list.get(1));
        System.out.println(list.get(0));
        System.out.println(a);

        list.set(2, 100);
        System.out.println(list.get(2));

        System.out.println();

        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));


        System.out.println(list.size());
        list.add(133);
        System.out.println(list);
        System.out.println(list.size());

//        list.clear();
//        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(222);
        list2.add(111);

        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);  // remove all list2 elems from list
        System.out.println(list);

        System.out.println(list.isEmpty());
//        list.clear();
        System.out.println(list.isEmpty());

        System.out.println();

        System.out.println(list.contains(100));
        System.out.println(list.contains(1001));

        System.out.println();
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.containsAll(list2));

        list.removeAll(list2);
        System.out.println(list.containsAll(list2));








    }
}
