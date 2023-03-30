package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class CheckIfTwoIntervalsIntersectsOrNot {

    public static void main(String[] args){

        int[][] input = new int[][]{
                {1,3},{7,9},{4,6},{10,13}
        };

        System.out.println(isIntervalIntersects(input));
    }

    public static boolean isIntervalIntersects(int[][] arr){

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] > o2[0]){
                    return 1;
                }
                else if(o1[0] < o2[0]){
                    return -1;
                }
                return 0;
            }
        });

        for(int i=1;i<arr.length;i++){
            if(arr[i-1][1] > arr[i][0]){
                return true;
            }
        }

        return false;
    }
}
