package com.kspendli.datastructures.linkedList;

public class DoubleLinkSample {

    public static void main(String[] args) {
        DoubleLinkNode head = new DoubleLinkNode(10);
        DoubleLinkNode node1 = new DoubleLinkNode(20);
        DoubleLinkNode node2 = new DoubleLinkNode(30);
        head.next = node1;
        node1.prev = head;

        node1.next = node2;
        node2.prev = node1;

    }


}
