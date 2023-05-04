public class BinaryTree{

    public Node root = null;
    private int size = 0;

    /**
     * Method to add root to tree
     *
     * @param worker that we want as root
     */
    public void setRoot(Worker worker) {
        // First check if tree is empty, if not let the user know
        if (this.size != 0){
            System.out.println("Tree is not empty");
        }
        else{
            Node newNode = new Node();  // Create new node to be added as root
            newNode.setElement(worker); // Set the passed worker as the new node's element
            this.root = newNode;        // Set the new node as the root of the tree
            this.size++;                // Increase size if the tree
        }
    }

    /**
     * Method to return the tree's root element
     *
     * @return Worker at root
     */
    public Worker root() {
        return this.root.getElement();  // call to getElement method in Node
    }

    /**
     * Method to return the parent of worker p
     *
     * @param p, worker whose parent element we want to find
     * @return worker object that is parent of p
     */
    public Worker parent(Worker p) {

        // Fid the node where p is located by using findNode method (explained later) and assign it to a new temporary node
        Node temp = findNode(this.root, p);
        // Check if the new node has a parent, if not we return null
        if (temp.getParent() == null)
            return null;
        return temp.getParent().getElement(); // return the node's parent element
    }

    /**
     * Method to return the left child of worker p
     *
     * @param p, worker whose left child element we want to find
     * @return worker object that is left child of p
     */
    public Worker left(Worker p) {

        // Fid the node where p is located by using findNode method (explained later) and assign it to a new temporary node
        Node temp = findNode(this.root, p);
        // Check if the new node has a left child, if not we return null
        if (temp.getLeft() == null)
            return null;
        return temp.getLeft().getElement();  // return the node's left child element
    }

    /**
     * Method to add left child
     *
     * @param current, worker to add left child to
     * @param left, worker object we want to add
     */
    public void setLeft(Worker current, Worker left) {

        Node newNode = new Node();    // Create new node to be used as left child
        newNode.setElement(left);     // Set the given worker as the new node's element
        Node currentNode = findNode(this.root, current);   // Find the current node to which we want to add the left child
        // Make sure the node exists
        if (currentNode == null){
            System.out.println("Worker not found in tree");
        }
        else {
            currentNode.setLeft(newNode);  // Set new node as current node's left child
            newNode.setParent(currentNode);  // Set current node as new node's parent
            size++;   // Increase size
        }
    }

    /**
     * Method to return the right child of worker p
     *
     * @param p, worker whose right child element we want to find
     * @return worker object that is right child of p
     */
    public Worker right(Worker p){
        // Fid the node where p is located by using findNode method (explained later) and assign it to a new temporary node
        Node temp = findNode(this.root, p);
        // Check if the new node has a right child, if not we return null
        if (temp.getRight() == null)
            return null;
        return temp.getRight().getElement();   // return the node's right child element
    }

    /**
     * Method to add right child
     *
     * @param current, worker to add right child to
     * @param right, worker object we want to add
     */
    public void setRight(Worker current, Worker right) {

        Node newNode = new Node();    // Create new node to be used as right child
        newNode.setElement(right);    // Set the given worker as the new node's element
        Node currentNode = findNode(this.root, current);   // Find the current node to which we want to add the right child
        // Make sure the node exists
        if (currentNode == null){
            System.out.println("Worker not found in tree");
        }
        else {
            currentNode.setRight(newNode);    // Set new node as current node's right child
            newNode.setParent(currentNode);   // Set current node as new node's parent
            size++;
        }
    }

    /**
     * Method to return the size of the tree
     *
     * @return int size
     */
    public int size(){
        return this.size;
    }

    /**
     * Method to print tree by using preorder method
     */
    public void printTree(){
        // Check if tree is empty, if true let user know
        if (this.root == null){
            System.out.println("Tree is empty");
        }
        else {
            this.preorder(this.root);  // call to preorder method
        }
    }

    /**
     * Method to visit each node in pre-order
     *
     * @param node, starting node to visit. Should be set as root of the tree
     */
    public void preorder(Node node){
        System.out.println(node.getElement());   // Print the element of the node being visited
        // If current node has a left child, call recursive method on the child until we find null
        if (node.getLeft() != null){
            preorder(node.getLeft());
        }
        // if current node has a right child, call recursive method on the child until we find null
        if (node.getRight() != null){
            preorder(node.getRight());
        }
    }

    /**
     * Method to find a specific node
     *
     * @param crawler, to traverse the tree, should start from root
     * @param element, value of the node we are looking for
     * @return node
     */

    public Node findNode(Node crawler, Worker element){

        if (crawler == null) // check if list is empty
            return null;

        // check if the node's element value equals the given worker, if true return the node
        if (crawler.getElement() == element){
            return crawler;
        }
        // Create the node we will return and make recursive call to the left children
        Node foundNode = findNode(crawler.getLeft(), element);
        // If node not found in left children (null), recursive call to right children
        if (foundNode == null)
            foundNode = findNode(crawler.getRight(), element);
        return foundNode; // Return the node once found (would return null if not found in tree)
    }
}
