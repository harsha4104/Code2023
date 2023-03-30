package linkedList;

public class RearrangeLinkedListInZigZagFashion {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);
        head.next.next.next.next.next.next = new LinkedList.Node(7);
        head.next.next.next.next.next.next.next = new LinkedList.Node(8);

        rearrageZigZag(head);
        LinkedList.Node.printLinkedList(head);
    }

    public static void rearrageZigZag(LinkedList.Node head){
        while(head!=null && head.next != null){
            if(head.next.data > head.data){
                int temp = head.data;
                head.data = head.next.data;
                head.next.data = temp;
            }
            if(head.next.next != null && head.next.data > head.next.next.data){
                int temp = head.next.data;
                head.next.data = head.next.next.data;
                head.next.next.data = temp;
            }

            head = head.next.next;
        }
    }
}
