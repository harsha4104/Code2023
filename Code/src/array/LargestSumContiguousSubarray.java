package array;

public class LargestSumContiguousSubarray {

    public static void main(String[] args){

        int[] input = new int[]{-2,-3,-4,-1,-2,-1,5,-3};

        System.out.println(largestSumOfContiguousSubarray(input));

    }

    public static int largestSumOfContiguousSubarray(int[] input){

        int sum = 0;

        int largestSum = Integer.MIN_VALUE;
        int s =0;
        int start = -1;
        int end = -1;

        for(int i=0; i<input.length;i++){
            sum = sum+input[i];
            if(largestSum < sum) {
                largestSum = sum;
                start = s;
                end = i;
            }

            if(sum<0){
                sum = 0;
                s=i;

            }
        }

        System.out.println(start+" "+end);

        return largestSum;
    }
}
