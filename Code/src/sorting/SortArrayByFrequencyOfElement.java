package sorting;

import java.util.*;

public class SortArrayByFrequencyOfElement {

    public static void main(String[] args){

        int[] input = new int[]{8,2,5,2,5,6,8,8};

        sortByFrequency(input);
    }

    public static void sortByFrequency(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for(int i= 0;i<arr.length;i++){
            if(!map2.containsKey(arr[i])){
                map2.put(arr[i], i);
            }
        }

        int[][] a = new int[map.size()][2];

        int index = 0;
        for(int keyset: map.keySet()){
            a[index][0] = map.get(keyset);
            a[index][1] = map2.get(keyset);
            index++;
        }

       Arrays.sort(a, new Comparator<int[]>() {
           @Override
           public int compare(int[] o1, int[] o2) {

               if(o1[0] > o2[0]){
                   return -1;
               }
               else if(o1[0] == o2[0]){
                   if(o1[1] >o2[1]){
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
            for(int j=0; j< a[i][0];j++) {
                System.out.print(arr[a[i][1]]+" ");
            }
        }
    }
}
