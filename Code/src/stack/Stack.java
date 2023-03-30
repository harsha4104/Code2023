package stack;

public class Stack {

    private int[] arr = new int[10000];
    private int end = -1;

    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
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

    public void push(int item) throws Exception{
        if(this.end >= this.arr.length){
            throw new Exception("Stack is Full");
        }

        this.end++;
        this.arr[end] = item;
    }

    public int pop() throws Exception{
        if(this.end == -1){
            throw new Exception("Stack is Empty.");
        }
        int item = this.arr[end];
        this.end--;
        return item;
    }

    public int size() {
        return end+1;
    }

    public int peak() throws Exception{
        if(this.end == -1){
            throw new Exception("Stack is Empty.");
        }
        int item = this.arr[end];
        return item;
    }


}
