package binaryTree;

public class FindAllAncestorsOfAGivenNode {

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);

        traversalForancestors(root, 11);
    }

    public static TreeNode traversalForancestors(TreeNode root, int key){

        if(root == null){
            return null;
        }

        if(root.data == key){
            return root;
        }

        TreeNode left = traversalForancestors(root.left, key);
        TreeNode right = traversalForancestors(root.right, key);


        if(left != null || right != null){
            System.out.print(root.data+" ");
            return root;
        }

        return null;

    }
}
