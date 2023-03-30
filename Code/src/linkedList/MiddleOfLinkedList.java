package linkedList;

public class MiddleOfLinkedList {

    public static void main(String[] args){

        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);
        head.next.next.next.next.next.next = new LinkedList.Node(7);

        printMiddleOfLinkedList(head);

    }

    public static void printMiddleOfLinkedList(LinkedList.Node head){

        LinkedList.Node temp1 = head;
        LinkedList.Node temp2 = head;

        while(temp2 != null){
            if(temp2.next != null){
                temp2 = temp2.next.next;
            }
            else{
                break;
            }
            temp1 = temp1.next;
        }

        System.out.println(temp1.data);
    }


}
