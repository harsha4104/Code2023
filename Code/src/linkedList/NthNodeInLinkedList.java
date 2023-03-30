package linkedList;

public class NthNodeInLinkedList {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);

        try {
            System.out.println(nthNodeInLinkedList(head, 8));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static int nthNodeInLinkedList(LinkedList.Node head, int nth) throws Exception{
        int i = 1;
        while(head != null){
            if(i == nth){
                return head.data;
            }
            i++;
            head = head.next;
        }

        throw new Exception("No Element Found");
    }
}
