package com.kspendli.datastructures.linkedList;

public class DoubleLinkReverseList {

    public static void main(String[] args) {
        DoubleLinkNode head = new DoubleLinkNode(10);
        DoubleLinkNode node1 = new DoubleLinkNode(20);
        DoubleLinkNode node2 = new DoubleLinkNode(30);
        head.next = node1;
        node1.prev = head;

        node1.next = node2;
        node2.prev = node1;
        printValues(head);
        
        head = reverseLinkeList(head);
        printValues(head);
    }

    private static DoubleLinkNode reverseLinkeList(DoubleLinkNode head) {
        if(head==null || head.next==null){
            return head;
        }

        DoubleLinkNode prev = null;
        DoubleLinkNode current = head;
        while (current!=null){
            prev = current.prev;
            current.prev = current.next;
            current.next = prev;
            current = current.prev;
        }
        return prev.prev;
    }

    private static void printValues(DoubleLinkNode head) {
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
