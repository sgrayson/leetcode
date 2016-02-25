/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LevelOrderBottomTraversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<List<Integer>> stack = new Stack<>();
        
        int f = -999;
        
        List<TreeNode> queue = new LinkedList<>();
        if (root != null)
        {
            queue.add(root);
            queue.add(new TreeNode(f));
        }
        
        List<Integer> curr = new LinkedList<>();
        while (!queue.isEmpty())
        {
            TreeNode node = queue.remove(0);
            if (node.val != f)
            {
                curr.add(node.val);
                System.out.println(node.val);
                if (node.left != null)
                {
                    queue.add(node.left);
                }
                if (node.right != null)
                {
                    queue.add(node.right);
                }
            }
            else
            {
                stack.push(curr);
                curr = new LinkedList<>();
                if (!queue.isEmpty())
                {
                    queue.add(new TreeNode(f));
                }
            }
        }
        
        List<List<Integer>> list = new LinkedList<>();
        while (!stack.isEmpty())
        {
            list.add(stack.pop());
        }
        
        return list;
    }
}