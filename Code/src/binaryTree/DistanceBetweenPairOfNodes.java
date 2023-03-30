package binaryTree;

public class DistanceBetweenPairOfNodes {

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        TreeNode lca = lowestCommonAncestor(root, 7,6);

//        System.out.println(lca.data);

        int distancetoNode1 = distance(root, 7, 0);
        int distancetoNode2 = distance(root, 6, 0);
        int distancetoLCA = distance(root, lca.data, 0);

        System.out.println("Distance Between node is "+(distancetoNode1+distancetoNode2 - 2*distancetoLCA));

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, int node1, int node2){

        if(root == null){
            return null;
        }

        if(root.data == node1 || root.data == node2){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, node1, node2);
        TreeNode right = lowestCommonAncestor(root.right, node1, node2);

        if(left != null && right != null){
            return root;
        }

        return left != null ? left : right;
    }

    public static int distance(TreeNode root, int key, int dis){
        if(root == null){
            return 0;
        }

        if(root.data == key){
            return dis;
        }

        int left = distance(root.left, key, dis+1);
        int right = distance(root.right, key, dis+1);

        return left!=0 ? left : right;
    }
}
