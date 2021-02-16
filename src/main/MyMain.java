package main;

import implementation.MyStack;

public class MyMain {
    public static void main(String[] args) {
        //capacity of stack
        int capacity = 5;
        //create stack, by creating instance of MyStack
        MyStack stack = new MyStack(capacity);
        stack.pop();
        stack.peek();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("size of stack  = " + stack.size());
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.traverse();
        System.out.println("Searching 40 in stack, found = "
                + stack.search(40));

    }
}
