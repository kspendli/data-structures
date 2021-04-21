package com.kspendli.datastructures.linkedList;

public class InsertNodeInBegin {

    public static void main(String[] args) {

        Node head = null;
        head = insertAtBegin(head, 10);
        head = insertAtBegin(head, 20);
        head = insertAtBegin(head, 30);
        head = insertAtBegin(head, 40);

        printValues(head);
    }

    private static void printValues(Node head) {
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    private static Node insertAtBegin(Node head, int data) {
        Node node = new Node(data);
        node.next = head;
        return node;
    }


}
