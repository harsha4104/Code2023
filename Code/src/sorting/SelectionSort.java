package sorting;

public class SelectionSort {

    public static void main(String[] args){

        int[] input = new int[]{2,3,4,1,5,6,7,9,3,10,15,17,20,11,12,9,8};

        selectionSort(input);

        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }

    }

    public static void selectionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
