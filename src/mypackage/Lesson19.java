package mypackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



// next, hasNext

public class Lesson19 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//
//        System.out.println(iterator.hasNext());

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
