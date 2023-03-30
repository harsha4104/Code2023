package linkedList;

public class CheckIfALinkedListIsPalindromeOrNot {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
//        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next = new LinkedList.Node(3);
        head.next.next.next.next = new LinkedList.Node(2);
        head.next.next.next.next.next = new LinkedList.Node(1);

        LinkedList.Node head2 = reverse(head);

        System.out.println(checkForPalindrome(head, head2));
    }

    public static LinkedList.Node reverse(LinkedList.Node head){
        LinkedList.Node pre = null;
        LinkedList.Node next = head;
        LinkedList.Node temp = head;

        while(temp!=null){
            temp = temp.next;
            next.next = pre;
            pre = next;
            next = temp;
        }
        return pre;
    }

    public static boolean checkForPalindrome(LinkedList.Node head1, LinkedList.Node head2){

        while(head1 != null && head2 != null){
            if(head1.data != head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return true;
    }
}
