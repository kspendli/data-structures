package com.kspendli.datastructures.linkedList;

public class PrintLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printNodeValues(head);
    }

    private static void printNodeValues(Node head) {
        Node current = head;

        while (current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }


}
