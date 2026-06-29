package Collections.Lists.Vector;

import java.util.Vector;

public class ThreadExample {
    public static void main(String[] args) {
        Vector<Integer> ThreadVector = new Vector<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                ThreadVector.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                ThreadVector.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }


        System.out.println("Size is :"  + ThreadVector.size());
    }
}
