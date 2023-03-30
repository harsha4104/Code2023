package linkedList;

public class MergeReverseTwoSortedLinkedList {

    public static void main(String[] args){
        LinkedList.Node head = new LinkedList.Node(1);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(3);
        head.next.next.next = new LinkedList.Node(4);
        head.next.next.next.next = new LinkedList.Node(5);
        head.next.next.next.next.next = new LinkedList.Node(6);
        head.next.next.next.next.next.next = new LinkedList.Node(7);

        LinkedList.Node head2 = new LinkedList.Node(2);
        head2.next = new LinkedList.Node(3);
        head2.next.next = new LinkedList.Node(4);
        head2.next.next.next = new LinkedList.Node(5);

        LinkedList.Node mergeTwoLinkedlist = mergeTwoSortedLinkedList(head, head2);

        LinkedList.Node.printLinkedList(mergeTwoLinkedlist);

        LinkedList.Node reverseNode = reverse(mergeTwoLinkedlist);

        System.out.println();

        LinkedList.Node.printLinkedList(reverseNode);
    }

    public static LinkedList.Node mergeTwoSortedLinkedList(LinkedList.Node head1, LinkedList.Node head2){

        LinkedList.Node head3 = null;
        LinkedList.Node temp = null;

        while(head1 != null && head2 != null){
            if(head1.data >= head2.data){
                if(head3 == null){
                    head3 = head2;
                    temp = head3;
                }
                else{
                    temp.next = head2;
                    temp = temp.next;
                }
                head2 = head2.next;
            }
            else if(head1.data < head2.data){
                if(head3 == null){
                    head3 = head1;
                    temp = head3;
                }
                else{
                    temp.next = head1;
                    temp = temp.next;
                }
                head1 = head1.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }

        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }
        return head3;
    }

    public static LinkedList.Node reverse(LinkedList.Node head){

        LinkedList.Node curr = head;
        LinkedList.Node next = head;
        LinkedList.Node pre = null;

        while(curr != null){
            curr = curr.next;
            next.next = pre;
            pre = next;
            next = curr;
        }

        return pre;
    }
}
