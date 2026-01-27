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
}
