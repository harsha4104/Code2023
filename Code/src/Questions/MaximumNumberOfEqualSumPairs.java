package Questions;

//
//You are given an array of N integers, you want to group the numbers into pairs such that the sum of the elements of each pair is the same. Each element can be a part of at most 1 pair. It is not necessary for all the elements to be part of some pair. Determine the maximum number of pairs such that the sum of the elements is the same for all pairs. The solution should be optimal from both space and time complexity.
//
//        Input
//
//        N = 5
//        arr = [1, 2, 6, 6, 5] = 1,2,5,6,6

//     pai1+6 == 2+5

// arr = [1,3,4,1,2,3,4]; 1,1,2,3,3,4;


import java.util.*;

public class MaximumNumberOfEqualSumPairs {

    public static void main(String[] args){

        int[] input = new int[]{1,2,6,6,5};

        // {0,1,2,3,3,5,8,8,9}

        System.out.println(findMaximumPairOfEqualSum(input));
    }


    public static int findMaximumPairOfEqualSum(int[] input) {

        Arrays.sort(input);
        int start = 0;
        int end = input.length - 1;
        int pair = 0;
        while (start < end) {
            if (input[start] + input[end] == input[start + 1] + input[end - 1]) {
                pair++;
                if(start+1 < end-1) {
                    if (start == 0 || end == input.length-1 ||(input[start - 1] + input[end + 1] != input[start] + input[end])){
                        System.out.println(input[start] + " " + input[end]);
                    }
                    System.out.println(input[start + 1] + " " + input[end - 1]);
                }

                    start++;
                    end--;

                    } else if (input[start] + input[end] < input[start + 1] + input[end - 1]) {
                        end--;
                    } else {
                        start++;
                    }
                }


        return pair;
            }

    }
