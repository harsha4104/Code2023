package backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllSubsetOfAnArray {

    public static void main(String[] args){

        int[] arr = new int[]{1,2,3};

        subset(arr, 0,new ArrayList<>());

    }

    public static void subset(int[] arr, int n, List<Integer> list){
        if(n == arr.length){
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }

            System.out.println();

            return;
        }
        list.add(arr[n]);

        subset(arr, n+1, list);
        list.remove(list.size()-1);
        subset(arr, n+1, list);
    }
}
