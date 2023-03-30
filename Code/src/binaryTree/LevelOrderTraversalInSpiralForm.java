package binaryTree;

import java.util.Stack;

public class LevelOrderTraversalInSpiralForm {

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

        levelOrderTraversalInSpiralForm(root);

    }

    public static void levelOrderTraversalInSpiralForm(TreeNode root){
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        if(root == null){
            return;
        }
        System.out.println(root.data);
        if(root.right != null) {
            stack1.push(root.right);
        }
        if(root.left != null){
            stack1.push(root.left);
        }


        while(!stack1.isEmpty() || !stack2.isEmpty()){

            int size = stack1.isEmpty() ? 0 : stack1.size();

            while(size >0){
                TreeNode temp = stack1.pop();
                System.out.print(temp.data+" ");

                if(temp.left != null){
                    stack2.push(temp.left);
                }

                if(temp.right != null){
                    stack2.push(temp.right);
                }

                size--;
            }

            size = stack2.isEmpty() ? 0 : stack2.size();
            System.out.println();

            while(size >0){
                TreeNode temp = stack2.pop();
                System.out.print(temp.data+" ");

                if(temp.right != null){
                    stack1.push(temp.right);
                }

                if(temp.left != null){
                    stack1.push(temp.left);
                }
                size --;
            }

            System.out.println();
        }

    }
}
