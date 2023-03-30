package binaryTree;

public class BinaryTreeIsSumTreeOrNot {

    private static boolean sumTree = true;
    public static void main(String[] args){

        TreeNode root = new TreeNode(26);
        root.left = new TreeNode(10);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(6);

        isSumTree(root);

        System.out.println(sumTree);

    }

    public static int isSumTree(TreeNode root){

        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return root.data;
        }

        int ls = isSumTree(root.left);
        int rs = isSumTree(root.right);
        int sum = ls+rs;

        if(sum != root.data){
            sumTree = false;
        }

        return sum+root.data;
    }
}
