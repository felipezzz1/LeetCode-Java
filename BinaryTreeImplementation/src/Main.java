public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        int[] valuesToInsert = {5,3,1,10,15,7,20};

        for (int val : valuesToInsert) {
            tree.insert(val);
        }

        System.out.println(tree.search(7));
        System.out.println(tree.search(14));
        System.out.println(tree.search(10));
        System.out.println(tree.search(18));

        System.out.println("Preorder Traversal: " + tree.preorderTraversal());
        System.out.println("Inorder Traversal: " + tree.inorderTraversal());
        System.out.println("Postorder Traversal: " + tree.postorderTraversal());

        System.out.println("DFS: " + tree.dfs(tree.root, 10));
        System.out.println("BFS: " + tree.bfs(10));
    }
}