package binaryTree;

public class MaximumHeightOfBinaryTree {

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);

        System.out.println(maxHeight(root));

    }

    public static int maxHeight(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = maxHeight(root.left);
        int right = maxHeight(root.right);

        return Math.max(left, right)+1;
    }
}
