package Collections.Lists.LinkedList;

import java.util.LinkedList;

public class Task3 {
    //Browser History Program
    public static void main(String[] args) {
        LinkedList<String> history = new LinkedList<>();
        history.add("www.google.com");
        history.add("www.github.com");
        history.add("www.Youtube.com");
        history.add("www.linkedin.com");

        for(String s : history){
            System.out.println(s);
        }

        history.removeLast();
        System.out.println(history);

        history.add("www.stackoverflow.com");
        System.out.println(history);




    }
}
