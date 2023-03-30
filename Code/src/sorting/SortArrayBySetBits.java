package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortArrayBySetBits {

    public static void main(String[] args){

        int[] input = new int[]{5,2,3,9,4,6,7,15,32};

        sortArrayBySetBits(input);
    }

    public static void sortArrayBySetBits(int[] arr){

        int[][] a = new int[arr.length][2];

        for(int i=0;i<arr.length;i++){
            int setBit = setBits(arr[i]);
            a[i][0] = setBit;
            a[i][1] = i;
        }

        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if(o1[0] > o2[0]){
                    return -1;
                }
                else if(o1[0] == o2[0]){
                    if(o1[1] > o2[1]){
                        return 1;
                    }
                    else if(o1[1] == o2[1]){
                        return 0;
                    }
                    return -1;
                }

                return 1;
            }
        });

        for(int i=0;i<a.length;i++){
            System.out.print(arr[a[i][1]]+" ");
        }
    }

    public static int setBits(int number){

        int count =0;
        while(number > 0){
            if((number & 1) == 1){
                count++;
            }
            number = number>>1;
        }

        return count;
    }
}
