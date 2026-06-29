package Collections.Lists.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistusingStringDemo {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Zaid");
        list.add("Ajmeri");
        list.add("Java");
        list.add("Developer" );
        //System.out.println(list);



        //replacing elements
        List<String> list1 = Arrays.asList("Zaid", "Ajmeri", "Java", "Developer");
        list1.set(2,"Devops");
        list1.set(3, "Engineer");
        System.out.println(list1);


    }
}
