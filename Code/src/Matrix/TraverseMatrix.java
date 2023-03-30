package Matrix;

public class TraverseMatrix {

    public static void main(String[] args){

        int[][] mat = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        traverseI(mat);

        traverseR(mat, 0);
    }

    public static void traverseI(int[][] matrix){

        for(int i=0;i< matrix.length;i++){
            for(int j= 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void traverseR(int[][] matrix, int i){

        if(i>= matrix.length){
            return;
        }

        for(int j=0; j<matrix[i].length;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();

        traverseR(matrix, i+1);
    }
}
