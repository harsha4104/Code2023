package binaryTree;

public class IdenticalOrNotTree {

    public static void main(String[] args){

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(5);

        System.out.println(isIdentical(root1, root2));

    }

    public static boolean isIdentical(TreeNode root1, TreeNode root2){

        if(root1 == null && root2 == null){
            return true;
        }

        if(root1 == null || root2 ==null){
            return false;
        }

        if(root1.data != root2.data){
            return false;
        }

        return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }
}
