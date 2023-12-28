package com.stack;

public class StackMain {
    public static void main(String[] args) {
        StackFun stack = new StackFun();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();
        System.out.println("The popped element: "+stack.pop());
        stack.display();
        System.out.println("The peak element: "+stack.peak());
    }
}
