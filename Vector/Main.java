package Collections.Lists.Vector;

import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        System.out.println(vector.capacity());
        //default capacity = 10
        //when current size is full so vector automatically double by its current
        //we can give initialCapacity and IncrementCapacity

        Vector<Integer> vector1 = new Vector<>(5, 3); //it will add 3 so out vector capacity becomes 8
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);
        System.out.println(vector1.capacity()); // 5
        vector1.add(6);
        System.out.println(vector1.capacity()); // 8


        //we can give specified collection in vector
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Zaid");
        linkedList.add("Ajmeri");
        linkedList.add("Java Developer");

        Vector<String> linkedlistVector = new Vector<>(linkedList);
        System.out.println(linkedlistVector);

        //get()
        System.out.println(vector1.get(0)); // 1

        //set() - replace element
        vector1.set(4,28);
        System.out.println(vector1);

        //remove() - index
        vector1.remove(1);
        System.out.println(vector1);

        //remove() - Object
        linkedlistVector.remove("Java Developer");
        System.out.println(linkedlistVector);

        //size
        System.out.println(vector1.size());

        //isEmpty()
        System.out.println(vector.isEmpty());

        //Contains()
        System.out.println(linkedlistVector.contains("Ajmeri"));

        //clear()
        vector1.clear();
        System.out.println(vector1);

   }
}
