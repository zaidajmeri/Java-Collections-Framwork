package Collections.Lists.LinkedList;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //reversing LinkedList
        LinkedList<Integer> reverseList = new LinkedList<>();
       for(Integer i : list){
           reverseList.addFirst(i);
       }
        System.out.println(reverseList);
        reverseList.addFirst(10);
        System.out.println(reverseList);

    }
}
