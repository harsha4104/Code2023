package linkedList;

public class DeleteAgivenKey {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);

        LinkedList.Node.printLinkedList(head);
        System.out.println();
//        head = deleteAGivenKey(head,4);
        head = deleteNodeAtGivenPosition(head, 2);
        LinkedList.Node.printLinkedList(head);


    }

    public static LinkedList.Node deleteAGivenKey(LinkedList.Node head, int key){
        if(head != null && head.data == key){
            head = head.next;
            return head;
        }

        LinkedList.Node temp = head;

        while(temp != null && temp.next != null){
            if(temp.next.data == key){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

        return head;
    }

    public static LinkedList.Node deleteNodeAtGivenPosition(LinkedList.Node head, int position){

        if(position == 1){
            if(head == null){
                return head;
            }
            head = head.next;
            return head;
        }

        LinkedList.Node temp = head;

        for(int i=1; i<position && temp != null; i++){
            if(i== position-1){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

        return head;
    }
}
