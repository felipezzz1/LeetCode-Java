public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        int[] valuesToInsert = {10,5,15,3,7,12,18};

        for (int val : valuesToInsert) {
            tree.insert(val);
        }

        System.out.println(tree.search(7));
        System.out.println(tree.search(14));
        System.out.println(tree.search(21));
        System.out.println(tree.search(18));
    }
}