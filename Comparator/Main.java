package Collections.Lists.Comparator;

import java.util.*;


//for String
class StingLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        return o2.length()  - o1.length();
        // o1    o2
        //"Ok"  "Bye"
    }
}

//for Integer
class MyComparatorInt implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class Main {
    public static void main(String[] args) {

        //Integer
        List<Integer> list   = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        list.sort(new MyComparatorInt());
        System.out.println(list);



        //String
        List<String> words = Arrays.asList("Banana", "Apple","Mango", "Pineapple");
        words.sort(new StingLengthComparator());
        System.out.println(words);

        //Using Lambda Expression
        List<String> words2 = Arrays.asList("Bag", "Student","Pen", "Book");
        words2.sort((s1, s2) -> s2.length() - s1.length());
        System.out.println(words2);

    }
}
