package mypackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lesson21 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Black");       //put
        map.put(2,"White");
        map.put(3,"Yellow");
        map.put(10,"Green");

        System.out.println(map.get(1));  //get
        System.out.println(map.get(10));

        System.out.println(map.size());  //size
//        map.clear();                     //clear
        System.out.println(map.size());

        System.out.println(map.containsKey(90));   //containsKey
        System.out.println(map.containsKey(10));

        System.out.println(map.containsValue("White"));  //containsValue
        System.out.println(map.containsValue("Grey"));


        //----
        Set<Integer> keys = map.keySet(); // make set of keys from map
        System.out.println(keys);

        Iterator<Integer> iterator = keys.iterator(); // make keys iterator
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }

        //----

        map.put(2, "Yellow");
        System.out.println(map);


        Map<String, String> mapstr = new HashMap<>();
        mapstr.put("name", "Alex");
        mapstr.put("age", "30");

        System.out.println(mapstr);
        System.out.println(mapstr.get("name"));
        System.out.println(mapstr.get("age"));





    }
}
