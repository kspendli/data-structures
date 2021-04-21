package com.kspendli.datastructures.linkedList;

public class DeleteLastNode {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = deleteEndNode(head);
        printValues(head);
    }

    private static void printValues(Node head) {
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    private static Node deleteEndNode(Node head) {
        if(head==null || head.next==null){
            return null;
        }
        Node current = head;
        while(current.next.next!=null)
            current = current.next;
        current.next = null;

        return head;
    }
}
