package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

    public static void main(String[] args){

        Integer[] nums = new Integer[2];
        nums[0]=1;
        nums[1] = 20;

        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String a = String.valueOf(o1)+String.valueOf(o2);
                String b = String.valueOf(o2)+String.valueOf(o1);

                return b.compareTo(a);
            }
        });

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
