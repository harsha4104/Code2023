package array;

import java.util.Arrays;

public class PairWithGivenSumInArray {

    public static void main(String[] args){

        int[] input = new int[]{8,7,2,5,3,1};

        findPairWithSum(input,10);
    }

    public static void findPairWithSum(int[] input, int target){

        Arrays.sort(input);

        int start = 0;
        int end = input.length-1;

        while(start < end){
            if(input[start]+input[end] > target){
                end--;
            }
            else if(input[start]+input[end] < target){
                start++;
            }
            else{
                System.out.println(input[start]+" "+input[end]);
                start++;
                end--;
            }
        }
    }
}
