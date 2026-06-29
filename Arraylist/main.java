package Collections.Lists.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(28);
        list.add(5);
        list.addAll(list);
        System.out.println(list); //[1, 2, 3, 1, 2, 3]

        //accessing elements
        System.out.println(list.get(2)); //3

        //replacing element
        list.set(2,28);
        System.out.println(list); //[1, 2, 28, 1, 2, 3]

        //removing element
        list.remove(3);
         System.out.println(list); //[1, 2, 28, 2, 3]
        list.remove(Integer.valueOf(2));
        System.out.println(list); //[1, 2, 28, 2, 3]
         System.out.println(list.size()); //5

        //converting to array
        Object[] array = list.toArray();
        Integer[] array1 = list.toArray(new Integer[0]);
        System.out.println(array1);  //nothing print because we dont pass any value

        //sorting arraylist
        Collections.sort(list);
        System.out.println(list); //  [2, 5, 28]


    }
}
