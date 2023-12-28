package com.linkedlist;

public class LinkedListFunctions {
    Node head;
    public void append(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currentnode = head;
        while(currentnode.next != null) {
            currentnode = currentnode.next;
        }
        currentnode.next = newNode;
    }

    public void addFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertBetween(int before, int data, int after) {
        Node newNode = new Node(data);
        Node currentNode = head;
        while(currentNode.data != before) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public int pop() {
        int deletedValue = head.data;
        head = head.next;
        return deletedValue;
    }

    public int popLast() {
        Node currentNode = head;
        Node prev = null;
        while(currentNode.next != null) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        prev.next = null;
        return currentNode.data;
    }

    public void delete(int data) {
        Node currentNode = head;
        Node prev = null;
        while(currentNode.data != data) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        prev.next = currentNode.next;
    }

    public void search(int data) {
        Node currentNode = head;
        boolean isExist = false;
        while(currentNode != null) {
            if(currentNode.data == data) {
                System.out.println("The "+data+" is exist in the linked list");
                isExist = true;
            }
            currentNode = currentNode.next;
        }
        if(!isExist) {
            System.out.println("The "+data+" is not exist in the linked list");
        }
    }

    public void display() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    public void clear() {
        head = null;
    }
}
