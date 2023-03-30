package array;

public class ReplaceEveryElementByMultiplicationOfPreviousAndNext {

    public static void main(String[] args){

        int[] input = new int[]{2,3,4,5,6};

        int[] result = replaceEveryElementByMultiplicationOfPreviousAndNext(input);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }

    public static int[] replaceEveryElementByMultiplicationOfPreviousAndNext(int[] input) {

        int[] result = new int[input.length];

        for(int i=0;i<input.length;i++){
            if(i==0){
                result[i] = input[i]*input[i+1];
            }
            else if(i == input.length-1){
                result[i] = input[i-1]*input[i];
            }
            else {
                result[i] = input[i - 1] * input[i + 1];
            }
        }

        return result;
    }
}
