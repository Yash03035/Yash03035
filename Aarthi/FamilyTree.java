package Aarthi;
class TreeNode {
    String name;
    TreeNode left, right;
    TreeNode(String name) {
        this.name = name;
        left = right = null;
    }
}
public class FamilyTree {
    TreeNode root;
    void buildTree() {
        root = new TreeNode("mom");
        root.left = new TreeNode("dad");
        root.right = new TreeNode("you");
    }
    void printRoot() {
        if (root != null)
            System.out.println("Root: " + root.name);
        else
            System.out.println("Tree is empty.");
    }
    void printChildren(TreeNode node) {
        if (node == null) return;
        System.out.print(node.name + " -> ");
        System.out.print("Left: " + (node.left != null ? node.left.name : "null") + ", ");
        System.out.println("Right: " + (node.right != null ? node.right.name : "null"));
    }
    void printTopToBottom(TreeNode node) {
        if (node == null) return;
        System.out.println(node.name);
        printTopToBottom(node.left);
        printTopToBottom(node.right);
    }
    int countNodes(TreeNode node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
    int countLeaves(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }
    void printInOrder(TreeNode node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.name + " ");
        printInOrder(node.right);
    }
    void mirror(TreeNode node) {
        if (node == null) return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        mirror(node.left);
        mirror(node.right);
    }
    void printPaths(TreeNode node, String path) {
        if (node == null) return;
        if (path.length() > 0) path += " -> ";
        path += node.name;
        if (node.left == null && node.right == null) {
            System.out.println(path);
        } else {
            printPaths(node.left, path);
            printPaths(node.right, path);
        }
    }

    boolean isEmpty() {
        return root == null;
    }
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();
        System.out.println("Is tree empty? " + tree.isEmpty());
        tree.buildTree();
        System.out.println("\nAfter building tree:");
        tree.printRoot();
        tree.printChildren(tree.root);
        System.out.println("\nTop to bottom:");
        tree.printTopToBottom(tree.root);
        System.out.println("\nNode count: " + tree.countNodes(tree.root));
        System.out.println("Leaf node count: " + tree.countLeaves(tree.root));
        System.out.print("\nIn-order (left to right): ");
        tree.printInOrder(tree.root);
        System.out.println();
        System.out.println("\nMirroring tree...");
        tree.mirror(tree.root);
        System.out.print("In-order after mirror: ");
        tree.printInOrder(tree.root);
        System.out.println();
        System.out.println("\nAll paths from root to leaves:");
        tree.printPaths(tree.root, "");
        System.out.println("\nIs tree empty? " + tree.isEmpty());
    }
}