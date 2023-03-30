package linkedList;

public class RemoveDuplicateFromLinkedList {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(3);
        head.next.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next.next.next = new LinkedList.Node(5);

        LinkedList.Node.printLinkedList(head);

        System.out.println();

        removeDuplicateFromLinkedListRecurrsive(head);

        LinkedList.Node.printLinkedList(head);

    }

    public static void removeDuplicateFromLinkedList(LinkedList.Node head){

        while(head != null){
            if(head.next != null && head.data == head.next.data){
                head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }
    }

    public static void removeDuplicateFromLinkedListRecurrsive(LinkedList.Node head){
        if(head == null){
            return ;
        }

        if(head.next != null && head.data == head.next.data){
            head.next =  head.next.next;
            removeDuplicateFromLinkedList(head.next);
        }
        else{
             removeDuplicateFromLinkedListRecurrsive(head.next);
        }
    }
}
