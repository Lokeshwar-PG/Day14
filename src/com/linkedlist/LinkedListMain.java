package com.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListFunctions list = new LinkedListFunctions();
        list.append(56);
        list.append(30);
        list.append(70);
        list.display();
        list.clear();
        list.display();
        list.addFront(56);
        list.addFront(30);
        list.addFront(70);
        list.display();
        list.insertBetween(70,12,30);
        list.display();
        System.out.println("The deleted Item: "+list.pop());
        list.display();
        System.out.println("The deleted Item: "+list.popLast());
        list.display();
        list.search(30);
        list.append(40);
        list.append(70);
        list.display();
        list.delete(40);
        list.display();

    }
}
