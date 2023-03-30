package binaryTree;

public class CheckGivenTreeIsSumTreeOrNot {

    private static boolean isSumTree = true;
    public static void main(String[] args){

        TreeNode root = new TreeNode(44);
        root.left = new TreeNode(9);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);


        postOrderToCheckSumTree(root);

        System.out.println(isSumTree);
    }

    public static int postOrderToCheckSumTree(TreeNode root){

        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return root.data;
        }

        int left = postOrderToCheckSumTree(root.left);
        int right = postOrderToCheckSumTree(root.right);

        if(root.data != left+right){
            isSumTree = false;
        }

        return root.data+left+right;
    }
}
