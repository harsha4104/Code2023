package test;

public class FirstAndLastOccurenceOfNumber {

    public static void main(String[] args){
        int[] arr = new int[]{2,2,2,2,2,2,5};

        System.out.println(firstOccurence(arr, 0, arr.length-1, 2));
        System.out.println(lastOccurence(arr, 0, arr.length-1,2));
    }

    public static int firstOccurence(int[] arr, int low, int high, int target){

        while(low <= high){
            int mid = (low+high)/2;

            if((mid == 0 || arr[mid-1] != target) && arr[mid] == target){
                return mid;
            }

            if((mid == arr.length-1 || arr[mid+1] != target) && arr[mid] == target){
                return mid;
            }

            if(arr[mid] >= target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return -1;
    }

    public static int lastOccurence(int[] arr, int low, int high, int target){

        while(low <= high){
            int mid = (low+high)/2;

            if((mid == 0 || arr[mid-1] != target) && arr[mid] == target){
                return mid;
            }

            if((mid == arr.length-1 || arr[mid+1] != target) && arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return -1;
    }
}
