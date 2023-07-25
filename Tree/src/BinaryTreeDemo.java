public class BinaryTreeDemo {
    public static void main(String[] args) throws Exception {
        NodeTree root = new NodeTree(7, null, null);
        BinaryTree binaryTree = new BinaryTree(root);
        for (int i = 0; i < 10; i++) {
            NodeTree newNode = new NodeTree(i, null, null);
            binaryTree.AddNode(newNode, root);
        }
        binaryTree.search(5, root);
    }
}
