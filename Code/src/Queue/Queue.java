package Queue;

public class Queue {

     int front = -1;
    int rear = -1;
    int[] arr = new int[3];
    int size = 0;

    public static void main(String[] args) throws Exception {

        Queue queue = new Queue();
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
        queue.front();
        queue.rear();

    }

    public void enqueue(int item) throws Exception {
        if(this.size == this.arr.length){
            throw new Exception("Queue is Full");
        }

        rear = rear+1;
        if(front == -1){
            front = 0;
        }
        if(rear == arr.length){
            rear = 0;
        }

        this.arr[rear] = item;
        size++;
    }

    public int dequeue() throws Exception {
        if(this.size == 0){
            throw new Exception("Queue is Empty.");
        }
        int item = arr[front];
        size--;
        if(front == rear){
            front = -1;
            rear = -1;
            return item;
        }
        front = front+1;
        if(front == arr.length){
            front = 0;
        }
        return item;
    }

    public boolean isFull(){
        if(size == arr.length){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public int front() throws Exception {
        if(size > 0){
            return arr[front];
        }
        throw new Exception("Queue is Empty.");
    }

    public int rear() throws Exception {
        if(size>0){
            return arr[rear];
        }
        throw new Exception("Queue is Empty.");
    }


}
