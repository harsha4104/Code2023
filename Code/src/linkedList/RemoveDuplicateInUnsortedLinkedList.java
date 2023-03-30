package linkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInUnsortedLinkedList {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(3);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(2);
        head.next.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next.next.next.next = new LinkedList.Node(1);

        LinkedList.Node.printLinkedList(head);
        System.out.println();
        removeDuplicateFromUnsortedLinkedList(head);
        LinkedList.Node.printLinkedList(head);
    }

    public static void removeDuplicateFromUnsortedLinkedList(LinkedList.Node head){
        Set<Integer> set = new HashSet<>();
        set.add(head.data);

        LinkedList.Node pre = head;
        head = head.next;

        while(head != null){
            if(!set.contains(head.data)){
                pre.next = head;
                pre = pre.next;
                set.add(head.data);
            }
            else{
                pre.next = null;
            }
            head = head.next;
        }
    }
}
