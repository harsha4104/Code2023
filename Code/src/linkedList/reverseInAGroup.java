package linkedList;

public class reverseInAGroup {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);
        head.next.next.next.next.next.next = new LinkedList.Node(7);
        head.next.next.next.next.next.next.next = new LinkedList.Node(8);

        LinkedList.Node h = reverseInGroup(head,3);

        LinkedList.Node.printLinkedList(h);

    }

    public static LinkedList.Node reverseInGroup(LinkedList.Node head, int size){

        LinkedList.Node current = head;
        LinkedList.Node next = head;
        LinkedList.Node pre = null;
        LinkedList.Node resultHead = null;
        LinkedList.Node tail = null;
        while(head != null){
            current = head;
            next = head;
            pre = null;
            LinkedList.Node newTail = null;
            for(int i=0;i<size && current != null;i++){
                if(tail == null){
                    tail = current;
                }
                if(newTail == null){
                    newTail = current;
                }
                current = current.next;
                next.next = pre;
                pre = next;
                next = current;
            }
            head = current;
            if(resultHead == null){
                resultHead = pre;
            }
            else {
                tail.next = pre;
                tail = newTail;
            }
        }
        return resultHead;
    }
}
