package binaryTree;

import com.sun.source.tree.Tree;

public class LowestCommonAncestors {

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

        TreeNode lca = lowestCommonAncestors(root, 8,11);

        System.out.println(lca.data);

    }

    public static TreeNode lowestCommonAncestors(TreeNode root, int node1, int node2){

        if(root == null){
            return null;
        }

        if(root.data == node1 || root.data == node2){
            return root;
        }

        TreeNode lside = lowestCommonAncestors(root.left, node1, node2);
        TreeNode rside = lowestCommonAncestors(root.right, node1, node2);

        if(lside != null && rside != null){
            return root;
        }

        return lside != null ? lside : rside;
    }
}
