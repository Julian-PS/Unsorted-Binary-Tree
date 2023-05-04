/**
 * Class for the tree's nodes
 */
public class Node {

    private Worker element;  // value of the node
    private Node parent;    // pointer to node's parent
    private Node left;      // pointer to node's left child
    private Node right;     // pointer to node's right child

    public Worker getElement() {
        return element;
    }

    public void setElement(Worker element) {
        this.element = element;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return this.getElement().toString();
    }
}
