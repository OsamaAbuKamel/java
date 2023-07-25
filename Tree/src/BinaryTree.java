public class BinaryTree {
    NodeTree root;

    public BinaryTree(NodeTree root) {
        this.root = root;
    }

    public void AddNode(NodeTree newNode, NodeTree rootExplore) {
        if (rootExplore == null)
            return;
        if (newNode.value > rootExplore.value) {
            if (rootExplore.right == null)
                rootExplore.right = newNode;
            else
                AddNode(newNode, rootExplore.right);
        }
        if (newNode.value < rootExplore.value) {
            if (rootExplore.left == null)
                rootExplore.left = newNode;
            else
                AddNode(newNode, rootExplore.left);
        }
    }

    public void search(int value, NodeTree rootExplore) {
        if (rootExplore == null) {
            System.out.println("Value cannot Founded");
            return;
        }
        if (rootExplore.value == value) {
            System.out.println("Value is Founded");
            return;
        }
        if (value > rootExplore.value) {
            search(value, rootExplore.right);
        }
        if (value < rootExplore.value) {
            search(value, rootExplore.left);
        }
    }

}
