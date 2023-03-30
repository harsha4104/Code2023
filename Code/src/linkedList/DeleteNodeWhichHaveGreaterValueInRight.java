package linkedList;

public class DeleteNodeWhichHaveGreaterValueInRight {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(12);
        head.next = new LinkedList.Node(15);
        head.next.next = new LinkedList.Node(10);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);

        deleteLinkedListHavingGreaterValueInRight(head);

        LinkedList.Node.printLinkedList(head);
    }

    public static void deleteLinkedListHavingGreaterValueInRight(LinkedList.Node head){

        while(head != null){
            if(head.next != null && head.data < head.next.data){
                head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }
    }
}
