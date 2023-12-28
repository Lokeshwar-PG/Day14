package com.queue;

public class QueueFun {
    Node front = null;
    Node rear = null;
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if(front==null) {
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue() {
        front = front.next;
    }

    public void display() {
        Node currentNode = front;
        while(currentNode != null) {
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
