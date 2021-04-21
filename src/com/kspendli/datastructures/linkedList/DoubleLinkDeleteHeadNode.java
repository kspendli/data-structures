package com.kspendli.datastructures.linkedList;

public class DoubleLinkDeleteHeadNode {
    public static void main(String[] args) {
        DoubleLinkNode head = new DoubleLinkNode(10);
        DoubleLinkNode node1 = new DoubleLinkNode(20);
        DoubleLinkNode node2 = new DoubleLinkNode(30);
        head.next = node1;
        node1.prev = head;

        node1.next = node2;
        node2.prev = node1;

        head = deleteHeadNode(head);
        printValues(head);
    }

    private static DoubleLinkNode deleteHeadNode(DoubleLinkNode head) {
        if(head==null || head.next==null){
            return null;
        }else{
            head = head.next;
            head.prev = null;
            return head;
        }
    }

    private static void printValues(DoubleLinkNode head) {
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
