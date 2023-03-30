package linkedList;

public class nthNodeFromEndOfTheLinkedList {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);

        try{
            System.out.println(nthNodeFromEndOfTheLinkedList(null, 2));
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }

    public static int nthNodeFromEndOfTheLinkedList(LinkedList.Node head, int nth) throws Exception{

        if(head == null){
            throw new Exception("Linked List is empty.");
        }
        LinkedList.Node temp = head;

        for(int i=0;i<nth;i++){
            if(temp == null){
                throw new Exception("Linked has less number of nodes as compare to what you are asking.");
            }
            temp = temp.next;
        }

        LinkedList.Node temp2 = head;

        while(temp != null){
            temp =temp.next;
            temp2 = temp2.next;
        }

        return temp2.data;
    }
}
