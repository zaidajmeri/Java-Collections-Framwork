package Collections.Lists.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylists {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(25);
        arrayList.add(50);
       // System.out.println(arrayList.get(2)); //output : 50
        // System.out.println(arrayList.size()); //output : 3

        //all the elements  you can print
        for(int i = 0; i < arrayList.size(); i++){
             System.out.println(arrayList.get(i)); //output : 5 25 50
        }

        //using for each loop
        for(int x : arrayList){
            System.out.println(x); //output : 5 25 50
        }

        //for check element existence in arraylist
        System.out.println(arrayList.contains(25)); //true
        System.out.println(arrayList.contains(100)); //false

        //for removing element
//        arrayList.remove(50);
//        System.out.println(arrayList);
//        for (int x : arrayList) {
//            System.out.println(x);
//        }//output : 5 25



        //adding new element
        arrayList.add(2,33);
        System.out.println(arrayList);


        //replacing elements
        arrayList.set(1,100);
        for (int x : arrayList){
            System.out.println(x); //output : 5 100 33 25 50x
        }


        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
       // integerList.add(2,5); This will throw an UnsupportedOperationException because List.of() creates an immutable list.





    }
}
