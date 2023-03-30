package binaryTree;

public class InplaceConvertBinaryTreeToDLL {

    private static TreeNode head = null;
    private static TreeNode tail = null;

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        inplaceBinaryTreeToDLL(root);
        TreeNode temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.right;
        }
    }

    public static void inplaceBinaryTreeToDLL(TreeNode root){
        if(root == null){
            return;
        }

        inplaceBinaryTreeToDLL(root.left);

        if(head == null){
            head = root;
            tail = root;
        }
        else{
            tail.right = root;
            root.left = tail;
            tail = tail.right;
        }
        inplaceBinaryTreeToDLL(root.right);
    }
}
