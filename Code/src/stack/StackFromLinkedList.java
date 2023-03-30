package stack;

import linkedList.LinkedList;

public class StackFromLinkedList {

    LinkedList.Node head = null;
    int size = 0;

    public static void main(String[] args) throws Exception {
        StackFromLinkedList s = new StackFromLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.peak());
        System.out.println(s.pop());
        System.out.println(s.size());
        s.pop();
        System.out.println(s.peak());
        s.pop();
        System.out.println(s.size());
        s.pop();
        System.out.println(s.size());
    }

    public void push(int item){
        if(head == null){
            head = new LinkedList.Node(item);
        }
        else{
            LinkedList.Node temp = new LinkedList.Node(item);
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public int pop() throws Exception{
        if(head == null){
            throw new Exception("Stack is empty.");
        }
        size--;
        int item = head.data;
        head = head.next;
        return item;
    }

    public int peak() throws Exception{
        if(head == null){
            throw new Exception("Stack is empty()");
        }
        return head.data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return head == null ? true: false;
    }

}
