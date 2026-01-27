import java.util.HashMap;
import java.util.Map;

class Solution {
    private int postIndex;
    private Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;

        inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i],i);
        }

        return build(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int left, int right){
        if(left > right){
            return null;
        }

        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);

        int inorderIndex = inorderIndexMap.get(rootVal);

        root.right = build(inorder, postorder, inorderIndex + 1, right);
        root.left = build(inorder, postorder, left, inorderIndex -1);

        return root;
    }
}