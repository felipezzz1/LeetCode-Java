import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        return root != null ? inorder(root) : new ArrayList<>();
    }

    public List<Integer> inorder(TreeNode node){
        List<Integer> result = new ArrayList<>();

        if (node != null){
            result.addAll(inorder(node.left));
            result.add(node.val);
            result.addAll(inorder(node.right));
        }

        return result;
    }
}