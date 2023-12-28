package com.stack;

public class StackFun {
    private Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        if(top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        int deletedElement = top.data;
        top = top.next;
        return deletedElement;
    }

    public int peak() {
        return top.data;
    }

    public void display() {
        Node currentNode = top;
        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

}
