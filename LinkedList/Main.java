package Collections.Lists.LinkedList;

import Collections.Lists.Arraylist.Arraylists;

import java.lang.reflect.Array;
import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2); //output : 3 O(n)
        linkedList.addLast(4);
        linkedList.addFirst(0);
        System.out.println( linkedList.getFirst()); //output : 0
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.remove(2) + " removed 2 ");
        //System.out.println(linkedList.reversed()); //output : [4, 3, 2, 1, 0]
        linkedList.removeIf(x -> x % 2 ==0);
        System.out.println(linkedList);



        LinkedList<String> animal = new LinkedList<>(Arrays.asList("Dog", "Cat", "Elephant", "Lion"));
        System.out.println(animal);
      LinkedList<String> removeAnimal = new LinkedList<>(Arrays.asList("Cat", "Lion"));
      animal.removeAll(removeAnimal);
        System.out.println(animal);




    }
}
