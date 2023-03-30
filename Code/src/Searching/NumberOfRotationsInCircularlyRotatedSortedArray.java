package Searching;

public class NumberOfRotationsInCircularlyRotatedSortedArray {

    public static void main(String[] args){

        int[] arr = new int[]{1,1,1,1,1,1,1,1,2,1,1,1,1,1};

        int index = binarySearchInRotatedArray(arr, 0, arr.length-1);

        System.out.println(index);
    }

    public static int binarySearchInRotatedArray(int[] arr, int low, int high){

        if(low > high){
            return -1;
        }

        int mid = (low+high)/2;

        if(mid > low && arr[mid] < arr[mid-1]){
            return mid;
        }
        else if(mid < high && arr[mid] > arr[mid+1]){
            return mid+1;
        }
        else if(arr[mid] > arr[low]){
            return binarySearchInRotatedArray(arr, mid+1, high);
        }
        else{
            return binarySearchInRotatedArray(arr, low, mid-1);
        }
    }
}
