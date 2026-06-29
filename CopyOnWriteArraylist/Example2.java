package Collections.Lists.CopyOnWriteArraylist;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example2 {
    public static void main(String[] args) {
        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item 1");
        sharedList.add("Item 2");
        sharedList.add("Item 3");

        Thread readerThread  = new Thread(()->{
            try {
                while (true){
                    for (String item : sharedList){
                        System.out.println("Reading item: " + item);
                        Thread.sleep(100);
                    }
                }
            }
            catch (Exception e){
                System.out.println("Exception: " + e);
            }
        });

        Thread writerThread  = new Thread(()->{
            try {
                Thread.sleep(500);
                sharedList.add("Item 4");
                sharedList.add("Added Item 4 to the list");

                Thread.sleep(500);
                sharedList.remove("Item 1");
                System.out.println("removed  Item 1 from the list");
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        });

       // readerThread.start();
        writerThread.start();
    }
}
