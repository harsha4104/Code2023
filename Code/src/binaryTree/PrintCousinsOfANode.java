package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintCousinsOfANode {

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

        TreeNode parent = findParent(root, 11);

        List<Integer> nodesThatNeedNotToBePrinted = new ArrayList<>();
        if(parent.left != null){
            nodesThatNeedNotToBePrinted.add(parent.left.data);
        }
        if(parent.right != null){
            nodesThatNeedNotToBePrinted.add(parent.right.data);
        }

        int level = level(root, 11, 1);

        levelOrderTraversal(root, nodesThatNeedNotToBePrinted, level);
    }

    public static TreeNode findParent(TreeNode root, int key){
        if(root == null){
            return null;
        }

        if((root.left != null && root.left.data == key) || (root.right != null && root.right.data == key)){
            return root;
        }

        TreeNode left =  findParent(root.left, key);
        TreeNode right = findParent(root.right, key);

        return left != null ? left : right;
    }

    public static int level(TreeNode root, int key, int level){
        if(root == null){
            return 0;
        }

        if(root.data == key){
            return level;
        }

        int left = level(root.left, key, level+1);
        int right = level(root.right, key, level+1);

        return left != 0 ? left : right;
    }

    public static void levelOrderTraversal(TreeNode root, List<Integer> list, int level){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int l = 1;
        while(!queue.isEmpty()){
            int size = queue.size();

            while(size >0){
                TreeNode temp = queue.poll();

                if(l == level){
                    if(!list.contains(temp.data)){
                        System.out.print(temp.data+" ");
                    }
                }

                if(temp.left != null){
                    queue.add(temp.left);
                }

                if(temp.right != null){
                    queue.add(temp.right);
                }

                size--;

            }
            l++;
        }
    }
}
