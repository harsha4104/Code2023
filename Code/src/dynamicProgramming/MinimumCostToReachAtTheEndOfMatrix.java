package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class MinimumCostToReachAtTheEndOfMatrix {

    public static void main(String[] args){

        int[][] matrix = new int[][]{
                {1,2,5,4},
                {5,6,7,6},
                {9,1,8,2},
                {2,4,5,6}};

//        int answer = Integer.MAX_VALUE;
//
//        for(int i=0;i<matrix.length;i++){
//            answer = Math.min(answer, minimumCostToReachAtTheEnd(matrix,i,0));
//        }

        System.out.println(minimumCostToReachAtTheEnd2(matrix));
    }

    public static int minimumCostToReachAtTheEnd2(int[][] matrix){

        int[] answer = new int[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            answer[i] = matrix[i][matrix[0].length-1];
        }

        List<Integer> temp = new ArrayList<>();

       for(int j= matrix[0].length-2;j>=0;j--){
           int min = answer[0];
           int first = Integer.MAX_VALUE;
           int second = answer[0];
           int third = answer[1];
           for(int i=0;i<matrix.length;i++){
               min = Math.min(min,second);
               if(i != matrix.length-1) {
                   min = Math.min(min, third);
               }
               if(i != 0){
                   min = Math.min(min, first);
               }
//               temp.add(matrix[i][j]+min);
               answer[i] = matrix[i][j]+min;

               if(i < matrix.length-2) {
                   first = second;
                   second = third;
                   third = answer[i + 2];
               }
           }

//           for(int i=0;i<temp.size();i++){
//               answer[i] = temp.get(i);
//           }
//           temp.clear();
       }

       int mincost = Integer.MAX_VALUE;
       for(int i=0;i<matrix.length;i++){
           mincost = Math.min(mincost, answer[i]);
       }

       return mincost;
    }

    public static int minimumCostToReachAtTheEnd(int[][] matrix, int i, int j){

        if(!isValidCell(matrix, i, j)){
             return Integer.MAX_VALUE;
        }

        if(j == matrix[0].length-1){
            return matrix[i][j];
        }

        return matrix[i][j]+Math.min(minimumCostToReachAtTheEnd(matrix,i+1,j+1), Math.min(minimumCostToReachAtTheEnd(matrix, i-1,j+1),minimumCostToReachAtTheEnd(matrix,i,j+1)));

    }

    public static boolean isValidCell(int[][] matrix, int i, int j){
        if(i>=0 && i<matrix.length && j >=0 && j<matrix[0].length){
            return true;
        }
        return false;
    }
}
