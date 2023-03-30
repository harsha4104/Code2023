package array;

public class SortBinaryArrayInLinearTime {

    public static void main(String[] args){

        int[] input = new int[]{1,0,1,0,1,0,0,1};

        sortBinaryArray(input);

        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
    }

    public static void sortBinaryArray(int[] input){
        int start = 0;
        int end = input.length-1;

        while(start<end){
            if(input[start] == 1){
                int temp = input[end];
                input[end] = input[start];
                input[start] = temp;
                end--;
            }
            else{
                start++;
            }
        }
    }
}
