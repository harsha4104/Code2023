package linkedList;

public class SearchAnElementInLinkedList {

    public static void main(String[] args){

        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);

        System.out.println(searchIterative(head, 4));
        System.out.println(searchRecursive(head, 10));
    }

    public static boolean searchIterative(LinkedList.Node head, int key){
        while(head != null){
            if(head.data == key){
                return true;
            }
            head = head.next;
        }

        return false;
    }

    public static boolean searchRecursive(LinkedList.Node head, int key){
        if(head == null){
            return false;
        }

        if(head.data == key){
            return true;
        }

        return searchRecursive(head.next, key);
    }
}
