package linkedList;

public class PartitionAlinkedListAroundAgivenValue {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(5);
        head.next = new LinkedList.Node(3);
        head.next.next = new LinkedList.Node(8);
        head.next.next.next = new LinkedList.Node(9);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(1);
        head.next.next.next.next.next.next = new LinkedList.Node(8);
        head.next.next.next.next.next.next.next = new LinkedList.Node(7);

        LinkedList.Node.printLinkedList(head);
        System.out.println();

        LinkedList.Node.printLinkedList(partitionLinkedListAroundAvalue(head,5));
    }

    public static LinkedList.Node partitionLinkedListAroundAvalue(LinkedList.Node head, int value){
        LinkedList.Node head1 = null;
        LinkedList.Node head2 = null;
        LinkedList.Node start2 = null;
        LinkedList.Node start1 = null;

        while(head!= null){
            if(head.data <= value){
                if(head1 == null){
                    head1 = head;
                    start1 = head1;
                }
                else{
                    head1.next = head;
                    head1 = head1.next;
                }
            }
            else{
                if(head2 == null){
                    head2 = head;
                    start2 = head2;
                }
                else{
                    head2.next = head;
                    head2 = head2.next;
                }
            }
            head = head.next;
        }
        head1.next = start2;
        return start1;
    }
}
