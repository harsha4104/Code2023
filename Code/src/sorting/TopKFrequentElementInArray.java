package sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElementInArray {

    public static void main(String[] args){

        int[] arr = new int[]{1,2,1,2,1,1,3,4};
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        int[][] farr = new int[map.size()][2];
        int i=0;
        for(int key: map.keySet()){
            farr[i][0] = map.get(key);
            farr[i][1] = key;
            i++;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->b[0]-a[0]);

        for(i=0;i<farr.length;i++){
            pq.add(farr[i]);
        }
        int k=2;
        for(i=0;i<k;i++){
            System.out.println(pq.poll()[1]);
        }

    }
}
