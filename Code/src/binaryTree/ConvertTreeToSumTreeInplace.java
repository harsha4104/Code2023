package binaryTree;

public class ConvertTreeToSumTreeInplace {

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        convertToSumTree(root);

        inorder(root);
    }

    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static int convertToSumTree(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = convertToSumTree(root.left);
        int right = convertToSumTree(root.right);

        int temp = root.data;
        root.data = left+right;

        return temp+left+right;
    }
}
