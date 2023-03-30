package dynamicProgramming;

public class MininumCostPathFromStartToEnd {

    public static void main(String[] args){
        int[][] matrix = new int[][]{
                {4,7,8,6,4},
                {6,7,3,9,2},
                {3,8,1,2,4},
                {7,1,7,3,7},
                {2,9,8,9,3}
        };

//        System.out.println(minimumCost(matrix, 0,0));

        System.out.println(minimumCost2(matrix));
    }

    public static int minimumCost(int[][] matrix, int i, int j){
        if(i == matrix.length-1 && j== matrix[0].length-1){
            return matrix[i][j];
        }


        int cost = matrix[i][j];
        int right =Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;
        if(isNotValidCell(matrix,i,j+1)){
            right = minimumCost(matrix, i, j+1);
        }

        if(isNotValidCell(matrix, i+1, j)){
            down = minimumCost(matrix, i+1, j);
        }

//        System.out.println(i+" "+j+" "+right+" "+down);

        return cost+Math.min(right, down);
    }

    public static int minimumCost2(int[][] matrix){

        int[][] answer  = new int[matrix.length][matrix[0].length];

        answer[matrix.length-1][matrix[0].length-1] = matrix[matrix.length-1][matrix[0].length-1];

        for(int i=matrix.length-2;i>=0;i--){
            answer[i][matrix[0].length-1] = answer[i+1][matrix[0].length-1]+matrix[i][matrix[0].length-1];
        }

        for(int j= matrix[0].length-2; j>=0; j--){
            answer[matrix.length-1][j] = answer[matrix.length-1][j+1]+matrix[matrix.length-1][j];
        }

        for(int i= matrix.length-2; i>=0; i--){
            for(int j= matrix[0].length-2; j>=0 ;j--){
                answer[i][j] = matrix[i][j]+Math.min(answer[i+1][j], answer[i][j+1]);
            }
        }
//
//        for(int i=0;i<answer.length;i++){
//            for(int j=0;j<answer[0].length;j++){
//                System.out.print(answer[i][j]+" ");
//            }
//            System.out.println();
//        }

        return answer[0][0];
    }

    public static boolean isNotValidCell(int[][] matrix, int x, int y){
        if(x >=0 && x < matrix.length && y>=0 && y < matrix[0].length){
            return true;
        }
        return false;
    }
}
