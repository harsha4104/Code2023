package linkedList;

public class ReverseAlternateKnodesinLinkedList {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);
        head.next.next.next.next.next.next = new LinkedList.Node(7);
        head.next.next.next.next.next.next.next = new LinkedList.Node(8);

        LinkedList.Node h = reversAlternateKNodes(head, 3);

        LinkedList.Node.printLinkedList(h);
    }

    public static LinkedList.Node reversAlternateKNodes(LinkedList.Node head, int k){

        LinkedList.Node resultHead = null;
        LinkedList.Node current = head;
        LinkedList.Node next = head;
        LinkedList.Node pre = null;
        LinkedList.Node newTail = null;

        while(head != null){
            current = head;
            next = head;
            pre = null;
            LinkedList.Node tail = null;
            for(int i=0;i<k && current != null;i++){
                if(tail == null){
                    tail = current;
                }
                current = current.next;
                next.next = pre;
                pre = next;
                next = current;
            }

            if(resultHead == null){
                resultHead = pre;
            }

            if(newTail != null){
                newTail.next = pre;
            }

            head = current;
            tail.next = current;
            for(int i=0;i<k && head != null;i++){
                head = head.next;
                if(i == k-2){
                    newTail = head;
                }
            }


        }

        return resultHead;
    }
}
