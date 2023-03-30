package linkedList;

public class ReverseALinkedList {

    public static void main(String[] args){

        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);
        head.next.next.next.next.next.next = new LinkedList.Node(7);

        LinkedList.Node.printLinkedList(head);
        System.out.println();
        head = reverseALinkedList(head);
        LinkedList.Node.printLinkedList(head);
    }

    public static LinkedList.Node reverseALinkedList(LinkedList.Node head){

        LinkedList.Node pre = null;
        LinkedList.Node next = head;
        LinkedList.Node temp = head;

        while(head != null && next != null){
            temp = temp.next;
            next.next = pre;
            pre = next;
            next =temp;
        }

        return pre;
    }
}
