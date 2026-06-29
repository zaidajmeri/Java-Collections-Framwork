package Collections.Lists.CopyOnWriteArraylist;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylistDemo {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Egg");
        list.add("Chicken");
        list.add("Milk");
        System.out.println("Original List: " + list);


        for (String item : list) {
            System.out.println(item);

            //Try to modify while reading
            if (item.equals("Egg"))
            {
                list.add("Butter");
                System.out.println("Added Butter while reading");
            }
        }
        System.out.println("Updated List: " + list);
    }


}
