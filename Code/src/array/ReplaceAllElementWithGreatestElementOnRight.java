package array;

public class ReplaceAllElementWithGreatestElementOnRight {

    public static void main(String[] args){

        int[] input = new int[]{16,17,4,3,5,2};
        int[] result = greatestElementOnRight(input);

        for(int i = 0; i< result.length;i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] greatestElementOnRight(int[] input){

        int[] result = new int[input.length];
        int largest = -1;

        for(int i = input.length-1;i>=0;i--){
            if(input[i] > largest){
                result[i] = largest;
                largest = input[i];
            }
            else{
                result[i] = largest;
            }
        }

        return result;
    }
}
