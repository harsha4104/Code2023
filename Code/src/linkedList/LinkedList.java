package linkedList;

public class LinkedList {


    public static void main(String[] args){

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }

    }

    public static class Node{

        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        public static void printLinkedList(Node temp){
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

    }

}



