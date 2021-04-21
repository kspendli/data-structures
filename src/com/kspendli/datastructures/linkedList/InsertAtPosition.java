package com.kspendli.datastructures.linkedList;

public class InsertAtPosition {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);

        head = insetNodeAtPosition(head, 2, 30);
        printValues(head);
    }

    private static Node insetNodeAtPosition(Node head, int p, int data) {
        int cp = 1;
        Node current = head;
        while (current.next!=null && p!=cp){
            current = current.next;
            cp++;
        }

        if(cp==p){
            Node node = new Node(data);
            Node temp = current.next;
            current.next = node;
            node.next = temp;
        }
        return head;
    }

    private static void printValues(Node head) {
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
