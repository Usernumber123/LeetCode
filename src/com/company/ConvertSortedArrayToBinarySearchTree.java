package com.company;

// time complexity O(n) где n - nums.length
// space complexity O(n) где n - nums.length
public class ConvertSortedArrayToBinarySearchTree {


    public TreeNode sortedArrayToBST(int[] nums) {

        return BST(nums, 0, nums.length - 1);

    }

    private TreeNode BST(int[] arr, int l, int r) {
        if (l > r) {
            return null;
        }
        TreeNode root = new TreeNode();
        int mid = (l + r) / 2;
        root.val = arr[mid];
        root.left = BST(arr, l, mid - 1);
        root.right = BST(arr, mid + 1, r);
        return root;

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