package binaryTree;

public class CheckForHeightBalanceInBinaryTree {

    private static boolean isHeightBalanced = true;

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        heightBalance(root);

        System.out.println(isHeightBalanced);

    }

    public static int heightBalance(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftHeight = heightBalance(root.left);
        int rightHeight = heightBalance(root.right);

        if(Math.abs(leftHeight-rightHeight)>1){
            isHeightBalanced = false;
        }

        return Math.max(leftHeight,rightHeight)+1;
    }
}
