package array;

public class TestQuestion {

    //2,6,4,8,10,9,15

    //2,4,5,6,7,8,9,9,19,18

    //2,4,1,3,4,5,16,7,6,5,3,8,10


    public static void main(String[] args){

       int[] arr = new int[]{2,4,1,3,4,-1,23,5,16,7,6,5,3,8,10};

        System.out.println(minimumSubArrayToBeSorted(arr));
    }

    public static int minimumSubArrayToBeSorted(int[] arr){

        int left = 0;
        int right = arr.length-1;

        for(int i=0;i<arr.length-1;i++){
            left++;
            if(arr[i] > arr[i+1]){
                break;
            }
        }

        for(int i=arr.length-1; i>0;i--){
            right--;
            if(arr[i] < arr[i-1]){
                break;
            }
        }

        int min = findMinimum(arr, left,right);
        int max = findMaximum(arr, left,right);

        for(int i=min-1; i>=0;i--){
            left = i;
           if(arr[i] <= arr[min]){
               break;
           }

        }

        for(int j = max+1; j<arr.length; j++){
            right = j;
            if(arr[j] >= arr[max]){
                break;
            }
        }

        return right-left+1;

    }

    public static int findMinimum(int[] arr ,int left, int right){
        int min = left;
        for(int i=left; i<=right;i++){
            if(arr[min] > arr[i]){
                min = i;
            }
        }

        return min;
    }

    public static int findMaximum(int[] arr, int left, int right){

        int max = left;
        for(int i=left;i<=right;i++){
           if(arr[max] < arr[i]){
               max = i;
           }
        }
        return max;
    }
}
