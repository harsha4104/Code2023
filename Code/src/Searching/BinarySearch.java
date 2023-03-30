package Searching;

public class BinarySearch {

    public static void main(String[] args){

        int[] arr = new int[]{1,2,3,4,5,5,5,6,7,8,9};

        int index = binarySearchIterative(arr, 0, arr.length-1, 16);

        if(index >=0){
            System.out.println(index);
        }
        else{
            System.out.println("Element not present in the Array");
        }

    }

    public static int binarySearch(int[] arr, int low, int high, int key){

        if(low > high){
            return -1;
        }

        int mid = (low+high)/2;

        if(arr[mid] >= key){
            return binarySearch(arr, low, mid-1, key);
        }
        else if(arr[mid] < key){
            return binarySearch(arr, mid+1, high, key);
        }
        return mid;
    }

    public static int binarySearchIterative(int[] arr, int low, int high, int key){

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] > key){
                high = mid-1;
            }
            else if(arr[mid] < key){
                low = mid+1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
