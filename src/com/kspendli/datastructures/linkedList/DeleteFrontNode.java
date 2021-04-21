package com.kspendli.datastructures.linkedList;

public class DeleteFrontNode {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node newNode = deleteHead(head);
        printValues(newNode);
    }

    private static void printValues(Node newNode) {
        while (newNode!=null){
            System.out.println(newNode.data);
            newNode = newNode.next;
        }
    }

    private static Node deleteHead(Node head) {
        if(head!=null){
            return head.next;
        }else {
            return null;
        }
    }
}
