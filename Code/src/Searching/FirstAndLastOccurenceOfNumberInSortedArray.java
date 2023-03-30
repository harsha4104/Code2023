package Searching;

public class FirstAndLastOccurenceOfNumberInSortedArray {

    public static void main(String[] args){

        int[] input = new int[]{1,1,1,1,5,5};

        int index = rightBound(input, 0, input.length-1, 6, input.length);
//        int index = last(input,0,input.length-1, 6, input.length);

        int index2 = leftBound(input,0, input.length-1, 6);
        System.out.println(index);
        System.out.println(index2);
    }

    public static int rightBound(int[] arr, int low, int high, int target, int length){

        if(low > high){
            return -1;
        }

        int mid = low+(high-low)/2;
        if((mid == length-1 || arr[mid+1] > target) && arr[mid] == target  ){
            return mid;
        }
        if(arr[mid] > target){
            return rightBound(arr, low, mid-1, target, length);
        }
        return rightBound(arr, mid+1, high, target, length);
    }

    public static int leftBound(int[] arr, int low, int high, int target){

        if(low > high){
            return -1;
        }

        int mid = (low+high)/2;
        if((mid == 0 ||  arr[mid-1] < target) && arr[mid] == target){
            return mid;
        }
        else if(arr[mid] >= target){
            return leftBound(arr, low, mid-1, target);
        }
        return leftBound(arr, mid+1, high, target);
    }
}
