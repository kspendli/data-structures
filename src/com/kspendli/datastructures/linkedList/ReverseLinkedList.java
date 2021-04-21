package com.kspendli.datastructures.linkedList;

public class ReverseLinkedList {

    public static ListNode reverse(ListNode node){
        ListNode curr = node;
        ListNode prev = null;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode addElements(int[] a){
        ListNode headNode = new ListNode(a[0]);
        ListNode curNode = headNode;
        for (int i=1;i<a.length;i++){
                curNode.next = new ListNode(a[i]);
                curNode = curNode.next;
        }
        return headNode;
    }

    public static void printElements(ListNode node){
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
            int[] a={10,20,30,40};
            ListNode listNode = addElements(a);
            printElements(listNode);
            ListNode reverseNode = reverse(listNode);
            printElements(reverseNode);
    }
}
