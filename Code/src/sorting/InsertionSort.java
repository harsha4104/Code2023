package sorting;

public class InsertionSort {

    public static void main(String[] args){

        int[] input = new int[]{2,3,4,1,5,6,7,9,3,10,15,17,20,11,12,9,8};

        insertionSort(input);

        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
    }

    public static void insertionSort(int[] arr){

        for(int i=1;i<arr.length;i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j] > arr[j+1]){
                    int temp2 = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] =temp2;
                }
            }
        }
    }
}
