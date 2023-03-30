package binaryTree;

public class LargestSubTreeSum {

    private static int largestSum = 0;

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(-6);
        root.right.right = new TreeNode(2);

        largestSubTreeSum(root);

        System.out.println(largestSum);
    }

    public static int largestSubTreeSum(TreeNode root){
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return root.data;
        }

        int left = largestSubTreeSum(root.left);
        int right = largestSubTreeSum(root.right);

        if(largestSum < left+right+root.data){
            largestSum = left+right+root.data;
        }

        return root.data+left+right;
    }
}
