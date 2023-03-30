package linkedList;

public class RecurrsivelyPrintReverseOfLinkedList {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);
        head.next.next.next.next.next.next = new LinkedList.Node(7);

        reversePrint(head);
    }

    public static void reversePrint(LinkedList.Node head){
        if(head == null){
            return;
        }
        reversePrint(head.next);
        System.out.print(head.data+" ");
    }
}
