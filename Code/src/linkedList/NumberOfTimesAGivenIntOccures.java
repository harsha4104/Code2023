package linkedList;

public class NumberOfTimesAGivenIntOccures {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(6);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(6);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);
        head.next.next.next.next.next.next = new LinkedList.Node(7);

        System.out.println(numberOfTimesAgivenIntOccures(head, 6));
    }

    public static int numberOfTimesAgivenIntOccures(LinkedList.Node head, int key){

        int occurrence = 0;
        LinkedList.Node temp = head;
        while(temp != null){
            if(temp.data == key){
                occurrence++;
            }
            temp = temp.next;
        }

        return occurrence;
    }
}
