package com.kspendli.datastructures.linkedList;

public class InsertNodeAtEnd {
    public static void main(String[] args) {
        Node head = null;
        head = insertValueAtEnd(head,20);
        head = insertValueAtEnd(head,40);
        head = insertValueAtEnd(head,60);
        head = insertValueAtEnd(head,80);

        printValues(head);
    }

    private static void printValues(Node head) {;
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    private static Node insertValueAtEnd(Node head, int data) {
        Node node = new Node(data);
        if(head==null){
            return node;
        }
        Node current = head;
        while(current.next!=null)
            current = current.next;

        current.next = node;

        return head;
    }
}
