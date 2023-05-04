public class Main {
    public static void main(String[] args) {

        // Create the empty tree and the workers
        BinaryTree myTree = new BinaryTree();
        Worker ceo = new Worker("CEO", 100);
        Worker cto = new Worker("CTO", 120);
        Worker rd = new Worker("RD", 140);
        Worker eng = new Worker("ENG", 110);
        Worker hr = new Worker("HR", 77);
        Worker relation = new Worker("Relation", 22);
        Worker hiring = new Worker("HIRING", 20);

        // add workers to the tree
        myTree.setRoot(ceo);
        myTree.setLeft(ceo, cto);
        myTree.setRight(ceo, hr);
        myTree.setLeft(cto, rd);
        myTree.setRight(cto, eng);
        myTree.setLeft(hr, relation);
        myTree.setRight(hr, hiring);


        // Print tree and its size
        myTree.printTree();
        System.out.println("Tree's size = " + myTree.size());
    }
}
