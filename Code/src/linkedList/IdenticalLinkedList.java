package linkedList;

public class IdenticalLinkedList {

    public static void main(String[] args){

        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);

        LinkedList.Node head2 = new LinkedList.Node(1);
        head2.next = new LinkedList.Node(2);
        head2.next.next = new LinkedList.Node(3);
        head2.next.next.next = new LinkedList.Node(4);

        System.out.println(isIdenticalLinkedList(head, head2));
    }

    public static boolean isIdenticalLinkedList(LinkedList.Node first, LinkedList.Node second){

        while(first != null && second != null){
            if(first.data != second.data){
                return false;
            }

            first = first.next;
            second = second.next;
        }

        if(first != null){
            return false;
        }

        if(second != null){
            return false;
        }

        return true;
    }
}
