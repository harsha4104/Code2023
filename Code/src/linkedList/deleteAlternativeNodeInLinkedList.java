package linkedList;

public class deleteAlternativeNodeInLinkedList {

    public static void main(String[] args){

        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);
        head.next.next.next.next.next.next = new LinkedList.Node(7);
        head.next.next.next.next.next.next.next = new LinkedList.Node(8);

        LinkedList.Node.printLinkedList(head);
        System.out.println();

        deleteAlternativeNode(head);

        LinkedList.Node.printLinkedList(head);
    }

    public static void deleteAlternativeNode(LinkedList.Node head){
        while(head != null && head.next != null){
            head.next = head.next.next;
            head = head.next;
        }
    }
}
