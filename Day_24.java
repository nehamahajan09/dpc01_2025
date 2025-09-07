import java.util.*;

    class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    public class Day_24 {

        public static TreeNode buildTree(Integer[] arr) {
            if (arr.length == 0 || arr[0] == null) return null;

            TreeNode root = new TreeNode(arr[0]);
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int i = 1;

            while (!queue.isEmpty() && i < arr.length) {
                TreeNode current = queue.poll();

                if (i < arr.length && arr[i] != null) {
                    current.left = new TreeNode(arr[i]);
                    queue.add(current.left);
                }
                i++;

                if (i < arr.length && arr[i] != null) {
                    current.right = new TreeNode(arr[i]);
                    queue.add(current.right);
                }
                i++;
            }
            return root;
        }

        public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root == p || root == q) return root;
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left != null && right != null) return root;
            return (left != null) ? left : right;
        }


        public static TreeNode findNode(TreeNode root, int val) {
            if (root == null) return null;
            if (root.val == val) return root;
            TreeNode left = findNode(root.left, val);
            if (left != null) return left;
            return findNode(root.right, val);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the tree in level order (use -1 for null):");
            String[] input = sc.nextLine().split(" ");
            Integer[] arr = new Integer[input.length];
            for (int i = 0; i < input.length; i++) {
                if (input[i].equals("-1")) arr[i] = null;
                else arr[i] = Integer.parseInt(input[i]);
            }

            TreeNode root = buildTree(arr);

            System.out.print("Enter node p: ");
            int pVal = sc.nextInt();
            System.out.print("Enter node q: ");
            int qVal = sc.nextInt();

            TreeNode p = findNode(root, pVal);
            TreeNode q = findNode(root, qVal);

          
            TreeNode lca = lowestCommonAncestor(root, p, q);
            if (lca != null)
                System.out.println("Lowest Common Ancestor of " + pVal + " and " + qVal + " is: " + lca.val);
            else
                System.out.println("One or both nodes not found in the tree.");
        }
    }
