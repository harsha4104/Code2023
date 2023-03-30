package Searching;

public class CountOnesInSortedBinaryArray {

    public static void main(String[] args){

        int[] arr = new int[]{1,1,1,1};

        int indexOfLastOne = binarySearch(arr, 0, arr.length-1, arr.length-1);

        if(indexOfLastOne == -1){
            System.out.println("No 1 exist in the array");
        }
        else {
            System.out.println(arr.length-indexOfLastOne);
        }
    }

    public static int binarySearch(int[] arr, int low, int high, int length){

        if(low > high){
            return -1;
        }

        if(low == high && arr[low] == 1){
            return low;
        }

        int mid = (low+high)/2;

        if(mid-1 > 0 && arr[mid] == 1 && arr[mid-1] == 0){
            return mid;
        }
        else if(mid+1 < length && arr[mid] == 0 && arr[mid+1] == 1){
            return mid+1;
        }
        else if(arr[mid] == 0){
            return binarySearch(arr, mid+1, high, length);
        }
        else{
            return binarySearch(arr, low, mid-1, length);
        }
    }
}
