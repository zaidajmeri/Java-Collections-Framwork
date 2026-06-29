package Collections.Lists.LinkedList;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Zaid");
        list.add("Kaif");
        list.add("Latif");
        list.add("Hasina");
        list.add("Kasim");

        //print complete list
        System.out.println(list);

        //printing first element
        System.out.println(list.getFirst());

        //printing last element
        System.out.println(list.getLast());

        //removing first element
        System.out.println(list.removeFirst() + " removed first element");

        //removing last element
        System.out.println(list.removeLast() + " removed last element");

        //removed specific name
        System.out.println(list.remove("Latif"));

        System.out.println(list);


        LinkedList<String> city = new LinkedList<>();
        city.add("Bangalore");
        city.add("Ahmedabad");
        city.add("Berlin");
        city.add("Paris");
        city.add("Hawaii");

        System.out.println(city.get(2));

        //replacing element
        city.set(2,"Mumbai");
        System.out.println(city);





    }
}
