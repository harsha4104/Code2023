package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubsetSum {

    public static void main(String[] args){

        ArrayList a = new ArrayList<>();
        a.add(10);
        a.add("Harsh");

        int[] input = new int[]{3,34,4,12,5,2};

        System.out.println(subsetSum(input,0,0,9, new HashMap<>()));
    }

    public static boolean subsetSum(int[] arr, int n, int sum, int target, Map<String, Boolean> map){

        String key = String.valueOf(arr[n])+"|"+String.valueOf(sum);

        if(sum == target){
            map.put(key, true);
            return true;
        }

        if(sum > target || n>=arr.length){
            return false;
        }



        if(map.containsKey(key)){
            return map.get(key);
        }

       boolean result =  subsetSum(arr, n+1, sum, target,map)|| subsetSum(arr, n+1, sum+arr[n],target,map);

        map.put(key, result);
        return result;
    }
}
