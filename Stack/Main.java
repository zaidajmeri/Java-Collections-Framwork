package Collections.Lists.Stack;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack stack = new Stack();

        //adding element in the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        //removing from stack
        stack.pop();  //remove 4
        System.out.println(stack);

        //top element in stack
        System.out.println(stack.peek()); //3

        //isEmpty
        System.out.println(stack.isEmpty()); //false

        //size
        System.out.println(stack.size()); //3

        //searching in stack from top with 1 - one based index
        int search = stack.search(3);
        System.out.println(search);

        //we can use stack from Linkedlist class also
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        System.out.println(list); //[1, 2, 3]
       int getLast =  list.getLast();
        System.out.println(getLast); //3

        int remove = list.removeLast();
        System.out.println(remove); // 3

    }
}
