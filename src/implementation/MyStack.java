package implementation;

import myinterface.StackADT;

public class MyStack implements StackADT {
    //maximum number of elements in stack
    private final int MAX_CAPACITY;
    //to store elements of stack
    private int[] arr;
    //top
    int top;
    //constructor
    public MyStack(int MAX_CAPACITY){
        this.MAX_CAPACITY = MAX_CAPACITY;
        //construct an array
        arr = new int[MAX_CAPACITY];
        top = -1;
    }

    @Override
    public void push(int element) {
        if(top != MAX_CAPACITY - 1){
            // if stack not full insert
            top ++;
            arr[top] = element;
            System.out.println("Element inserted");
        }
        else{
            System.out.println("Stack OverFlow");
        }
    }

    @Override
    public int pop() {
        int response = 0;
        if(!isEmpty()){
            //stack is not empty you can delete
            response = arr[top];
            top --;
        }
        else{
            System.out.println("Strack UnderFlow");
        }
        return response;
    }

    @Override
    public int peek() {
        int response = 0;
        if(!isEmpty()){
            response = arr[top];
        }
        else {
            System.out.println("Stack is empty");
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
    public void traverse(){
        for (int i = 0; i <= top ; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    public boolean search(int searchElement){
        boolean response = false;
        for (int i = 0; i <= top ; i++) {
            if(arr[i] == searchElement){
                response = true;
                break;
            }
        }
        return response;
    }
}
