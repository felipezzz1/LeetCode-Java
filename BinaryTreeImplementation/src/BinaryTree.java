import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int val){
        if(root == null){
            root = new TreeNode(val);
        } else {
            insertRecursive(root,val);
        }
    }

    private void insertRecursive(TreeNode node, int val){
        if(val < node.val) {
            if(node.left != null){
                insertRecursive(node.left, val);
            } else {
                node.left = new TreeNode(val);
            }
        } else {
            if(node.right != null){
                insertRecursive(node.right, val);
            } else {
                node.right = new TreeNode(val);
            }
        }
    }

    public boolean search(int val) {
        return searchRecursive(root, val);
    }

    private boolean searchRecursive(TreeNode node, int val) {
        if (node == null) return false;

        if (node.val == val) return true;

        if (val < node.val) return searchRecursive(node.left, val);

        return searchRecursive(node.right, val);
    }

    public List<Integer> preorderTraversal(){
        List<Integer> result = new ArrayList<>();
        preorderTraversalRecursive(root, result);
        return result;
    }

    private void preorderTraversalRecursive(TreeNode node, List<Integer> result){
        if(node != null){
            result.add(node.val);
            preorderTraversalRecursive(node.left, result);
            preorderTraversalRecursive(node.right, result);
        }
    }

    public List<Integer> inorderTraversal(){
        List<Integer> result = new ArrayList<>();
        inorderTraversalRecursive(root, result);
        return result;
    }

    private void inorderTraversalRecursive(TreeNode node, List<Integer> result){
        if(node != null){
            inorderTraversalRecursive(node.left, result);
            result.add(node.val);
            inorderTraversalRecursive(node.right, result);
        }
    }

    public List<Integer> postorderTraversal(){
        List<Integer> result = new ArrayList<>();
        postorderTraversalRecursive(root, result);
        return result;
    }

    private void postorderTraversalRecursive(TreeNode node, List<Integer> result){
        if(node != null){
            postorderTraversalRecursive(node.left, result);
            postorderTraversalRecursive(node.right, result);
            result.add(node.val);
        }
    }
}
