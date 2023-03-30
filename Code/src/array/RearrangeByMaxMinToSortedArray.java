package array;

public class RearrangeByMaxMinToSortedArray {

    public static void main(String[] args){

        int[] input = new int[]{1,2,3,4,5,6,7,8};

        int[] result = rearrange(input);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }

    public static int[] rearrange(int[] input){

        int[] result = new int[input.length];
        int i=0;
        int start = 0;
        int end = input.length-1;
        while(start < end){
            result[i++] = input[end--];
            result[i++] = input[start++];
        }

        if(start == end){
            result[i] = input[start];
        }

        return result;
    }
}
