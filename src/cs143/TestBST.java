package cs143;

public class TestBST {

    public static void main(String[] args) {

        // Create a BST
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        // Test inserting the same value
        tree.insert("Daniel"); //insert the same value for coverage

        //Test getRoot method
        tree.getRoot(); //getRoot of the  value for coverage

        // Traverse tree
        System.out.print("Inorder (sorted): ");
        tree.list();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nThe number of nodes is " + tree.getSize());

        // Search for an element
        System.out.print("\nIs Peter in the tree? "
                + tree.search("Peter"));
        System.out.print("\nIs Leo in the tree? "
                + tree.search("Leo"));

        // Get a path from the root to Peter
        System.out.print("\nA path from the root to Peter is: ");
        java.util.ArrayList<String> path
                = tree.path("Peter");
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }

        Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
        BST<Integer> intTree = new BST<>(numbers);
        System.out.print("\nInorder (sorted): ");
        intTree.list();

        //Test delete
        tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        printTree(tree);

        System.out.println("\nAfter delete George:");
        tree.delete("George");
        printTree(tree);

        System.out.println("\nAfter delete Adam:");
        tree.delete("Adam");
        printTree(tree);

        System.out.println("\nAfter delete Michael:");
        tree.delete("Michael");
        printTree(tree);

        //Test iterator
        tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        for (String s : tree) {
            System.out.print(s.toUpperCase() + " ");
        }
    }

    public static void printTree(BST tree) {
        // Traverse tree
        System.out.print("Inorder (sorted): ");
        tree.list();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nThe number of nodes is " + tree.getSize());
        System.out.println();
    }
}
