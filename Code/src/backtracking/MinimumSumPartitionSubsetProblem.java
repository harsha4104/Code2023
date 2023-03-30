package backtracking;

public class MinimumSumPartitionSubsetProblem {

    public static void main(String[] args){

        int[] input = new int[]{1,3,100,4};
        int item = minimumSumPartitionSubset(input, 0, 0,0);

        System.out.println(item);

    }

    public static int minimumSumPartitionSubset(int[] arr, int currentIndex, int subset1, int subset2){

        if(currentIndex == arr.length){
            return Math.abs(subset1 - subset2);
        }

        int first = minimumSumPartitionSubset(arr, currentIndex+1, subset1+arr[currentIndex], subset2);

        int second = minimumSumPartitionSubset(arr, currentIndex+1, subset1, subset2+arr[currentIndex]);

        return Math.min(first,second);
    }
}
