package sorting;

public class SortAnArrayInWaveForm {

    public static void main(String[] args){

        int[] input = new int[]{20,10,8,6,4,2};

        sortInWaveForm(input);

        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
    }

    public static void sortInWaveForm(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            if(i%2 == 0){
                    if(arr[i] < arr[i]-1){
                        int temp = arr[i-1];
                        arr[i-1] = arr[i];
                        arr[i] = temp;
                    }

                    if(arr[i] < arr[i+1]){
                        int temp = arr[i+1];
                        arr[i+1] = arr[i];
                        arr[i] = temp;
                    }
            }
            else{
                if(arr[i] > arr[i-1]){
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }

                if(arr[i] > arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
