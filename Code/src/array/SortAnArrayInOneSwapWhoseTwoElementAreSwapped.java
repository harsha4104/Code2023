package array;

public class SortAnArrayInOneSwapWhoseTwoElementAreSwapped {

    public static void main(String[] args){
        int[] arr = new int[]{3,6,5,7,8,9};

        sortArray(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void sortArray(int[] arr){
        if(arr.length <=1){
            return;
        }

        int pre = arr[0];
        int first = -1;
        int second = -1;

        for(int i=1;i<arr.length;i++){
            if(pre > arr[i]){
                if(first == -1){
                    first = i-1;
                    second = i;
                }
                else{
                    second = i;
                }

            }
            pre = arr[i];
        }

        if(first != -1) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
}
