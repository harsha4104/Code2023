package linkedList;

public class AlternativeEvenOddInLinkedList {

    public static void main(String[] args){

        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);
        head.next.next.next.next.next.next = new LinkedList.Node(7);
        head.next.next.next.next.next.next.next = new LinkedList.Node(8);

        LinkedList.Node result = evenOddAlternate(head);

        LinkedList.Node.printLinkedList(result);
    }

    public static LinkedList.Node evenOddAlternate(LinkedList.Node head){

        LinkedList.Node even = null;
        LinkedList.Node odd = null;
        LinkedList.Node evenHead = null;
        LinkedList.Node oddHead = null;
        LinkedList.Node result = head;

        LinkedList.Node headStart = head;

        while(head != null){
            if(head.data%2 == 0){
                if(even == null){
                    even = head;
                    evenHead = even;
                }
                else{
                    even.next = head;
                    even = even.next;
                }
            }
            else{
                if(odd == null){
                    odd = head;
                    oddHead = odd;
                }
                else{
                    odd.next = head;
                    odd = odd.next;
                }
            }
            head = head.next;
        }


        while(evenHead != null && oddHead != null){
             headStart.data = evenHead.data;
             headStart = headStart.next;
             headStart.data = oddHead.data;
             headStart = headStart.next;
        }

        while(evenHead != null){
            headStart.data = evenHead.data;
            headStart = headStart.next;
            evenHead = evenHead.next;
        }

        while(oddHead != null){
           headStart.data = oddHead.data;
           headStart = headStart.next;
           oddHead = oddHead.next;
        }
        return result;
    }
}
