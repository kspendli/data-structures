package com.kspendli.datastructures.linkedList;

public class DoubleLinkDeleteTailNode {


    public static void main(String[] args) {
        DoubleLinkNode head = new DoubleLinkNode(10);
        DoubleLinkNode node1 = new DoubleLinkNode(20);
        DoubleLinkNode node2 = new DoubleLinkNode(30);
        head.next = node1;
        node1.prev = head;

        node1.next = node2;
        node2.prev = node1;
        printValues(head);

        head = deleteTailNode(head);
        printValues(head);
    }

    private static void printValues(DoubleLinkNode head) {
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    private static DoubleLinkNode deleteTailNode(DoubleLinkNode head) {
        DoubleLinkNode current = head;
        while (current.next!=null){
            current = current.next;
        }

        //once Reach last node just make it null;
        current.prev.next = null;

        return head;
    }


}
