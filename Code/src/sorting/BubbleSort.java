package sorting;

public class BubbleSort {

    public static void main(String[] args){

        int[] input = new int[]{2,3,4,1,5,6,7,9,3,10,15,17,20,11,12,9,8};

        bubbleSort(input);

        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
    }

    public static void bubbleSort(int[] arr){

        for(int i=0;i<=arr.length-2;i++){
            for(int j= 0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
