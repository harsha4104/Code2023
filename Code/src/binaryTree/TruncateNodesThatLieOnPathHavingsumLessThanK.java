package binaryTree;

public class TruncateNodesThatLieOnPathHavingsumLessThanK {

    public static void main(String[] args){

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(2);
        root.right.left.left = new TreeNode(1);
        root.right.left.right = new TreeNode(7);
        root.right.right.right = new TreeNode(3);

        truncateNodes(root, 0, 15);

        inorder(root);

    }

    private static void inorder(TreeNode root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }

    public static TreeNode truncateNodes(TreeNode root, int sum, int k){
        if(root == null){
            return null;
        }

        if(root.left == null  && root.right == null){
            sum = sum+root.data;
            if(sum < k){
                sum =sum-root.data;
                return null;
            }
            sum = sum-root.data;
            return root;
        }

        sum = sum+root.data;


        root.left = truncateNodes(root.left, sum, k);
        root.right = truncateNodes(root.right, sum, k);

        sum =sum-root.data;

        if(root.left == null && root.right == null){
            return null;
        }
        return root;
    }
}
