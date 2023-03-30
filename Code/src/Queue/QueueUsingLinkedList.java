package Queue;

import linkedList.LinkedList;

public class QueueUsingLinkedList {

    LinkedList.Node front = null;
    LinkedList.Node rear = null;
    int size = 0;

    public static void main(String[] args) throws Exception {

        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        System.out.println(queue.front());
        System.out.println(queue.rear());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(10);
        queue.enqueue(15);
        System.out.println(queue.front());
        System.out.println(queue.rear());
    }

    public void enqueue(int item){
        LinkedList.Node temp = new LinkedList.Node(item);
        size++;
        if(front == null){
            front = temp;
            rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    public int dequeue() throws Exception {
        if(front == null){
            throw new Exception("Queue is Empty.");
        }
        int item = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        size--;
        return item;
    }

    public int front() throws Exception {
        if(size > 0){
            return front.data;
        }
        throw new Exception("Queue is Empty.");
    }

    public int rear() throws Exception {
        if(size > 0){
            return rear.data;
        }
        throw new Exception("Queue is Empty.");
    }

    public boolean isEmpty(){
        if(size > 0){
            return false;
        }
        return true;
    }
}
