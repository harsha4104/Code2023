package linkedList;

public class LengthOfLinkedList {

    public static void main(String[] args){

        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);

        System.out.println(lengthIterative(head));
        System.out.println(lengthRecursive(head));
    }

    public static int lengthIterative(LinkedList.Node head){
        int i = 0;
        while(head != null){
            i++;
            head = head.next;
        }
        return i;
    }

    public static int lengthRecursive(LinkedList.Node head){
        if(head == null){
            return 0;
        }

        return 1+lengthRecursive(head.next);
    }
}
