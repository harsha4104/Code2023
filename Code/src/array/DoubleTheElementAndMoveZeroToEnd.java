package array;

public class DoubleTheElementAndMoveZeroToEnd {

    public static void main(String[] args){

        int[] input = new int[]{2,2,0,4,0,8};

        int[] result1 = doubleTheElement(input);

        int[] finalResult = moveZeroToEnd(result1);

        for(int i=0;i<input.length;i++){
            System.out.print(finalResult[i]+" ");
        }
    }

    public static int[] doubleTheElement(int[] input){

        for(int i=0;i<input.length-1;i++){
            if(input[i] != 0 && input[i] == input[i+1]){
                input[i] = 2*input[i];
                input[i+1] =0;
            }
        }
        return input;
    }

    public static int[] moveZeroToEnd(int[] input){
        int start = 0;

        for(int i=0;i<input.length;i++){
            if(input[i]!= 0){
                int temp = input[start];
                input[start] = input[i];
                input[i] = temp;
                start++;
            }
        }

        return input;
    }
}
