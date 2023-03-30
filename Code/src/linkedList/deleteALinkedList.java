package linkedList;

public class deleteALinkedList {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);

        head = deleteAlinkedList(head);
        LinkedList.Node.printLinkedList(head);
    }

    public static LinkedList.Node deleteAlinkedList(LinkedList.Node head){
        head = null;
        return head;
    }
}
