package com.company;

// time complexity O(n) где n - число узлов
// space complexity O(n) где n - число узлов (за счёт рекурсии)
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return BST(root, null, null);
    }

    public boolean BST(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.val <= min || max != null && root.val >= max) {
            return false;
        }
        return BST(root.left, min, root.val) && BST(root.right, root.val, max);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
