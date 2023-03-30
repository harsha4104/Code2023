package binaryTree;

public class InorderSuccessorOfANode {

    private static TreeNode successor = null;
    private static TreeNode answer = null;
    private static boolean flag = false;
    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);

        inorderReverse(root,5);

        System.out.println(answer.data);
    }

    public static void inorderReverse(TreeNode root, int key){
        if(root == null){
            return;
        }

        inorderReverse(root.right, key);

        if(root.data == key){
            answer = successor;
        }

        successor = root;

        inorderReverse(root.left, key);

    }


}
