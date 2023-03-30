package linkedList;

public class AlternativeSplitingOfLinkedList {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);
        head.next.next.next.next.next.next = new LinkedList.Node(7);
        head.next.next.next.next.next.next.next = new LinkedList.Node(8);

        alternativeSpliting(head);
    }

    public static void alternativeSpliting(LinkedList.Node head){

        LinkedList.Node head1 = null;
        LinkedList.Node head2 = null;
        LinkedList.Node head1Start = null;
        LinkedList.Node head2Start = null;

        while(head != null){
            if(head1 == null){
                head1 = head;
                head1Start = head1;
                head = head.next;
            }
            else{
                head1.next = head;
                head1 = head1.next;
                head = head.next;
            }

            if(head == null){
                break;
            }

            if(head2 == null){
                head2 = head;
                head2Start = head2;
                head = head.next;
            }
            else{
                head2.next = head;
                head2 = head2.next;
                head = head.next;
            }

            if(head == null){
                break;
            }
        }
        head1.next = null;
        head2.next = null;

        LinkedList.Node.printLinkedList(head1Start);
        System.out.println();
        LinkedList.Node.printLinkedList(head2Start);
    }
}
