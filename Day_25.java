import java.util.*;

class TreeNode1 {
    int val;
    TreeNode left, right;
    TreeNode1(int x) {
        val = x;
        left = right = null;
    }
}

public class Day_25 {

    // Function to check if tree is a valid BST
    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValidBST(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return isValidBST(node.left, min, node.val) &&
                isValidBST(node.right, node.val, max);
    }

    // Build tree from array (level order input)
    public static TreeNode buildTreeFromArray(Integer[] values) {
        if (values.length == 0 || values[0] == null) return null;

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < values.length) {
            TreeNode current = q.poll();

            // Left child
            if (i < values.length && values[i] != null) {
                current.left = new TreeNode(values[i]);
                q.add(current.left);
            }
            i++;

            // Right child
            if (i < values.length && values[i] != null) {
                current.right = new TreeNode(values[i]);
                q.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example: input like 2 1 3 (use -1 for nulls)
        System.out.println("Enter array elements for tree (use -1 for null), space separated:");
        String input = sc.nextLine().trim();
        String[] parts = input.replaceAll("\\[|\\]|,", " ").trim().split("\\s+");

        Integer[] arr = new Integer[parts.length];
        for (int i = 0; i < parts.length; i++) {
            int val = Integer.parseInt(parts[i]);
            arr[i] = (val == -1) ? null : val;
        }

        TreeNode root = buildTreeFromArray(arr);

        if (isValidBST(root)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
