package dsa;
// Java program to implement iterative preorder traversal
import java.util.Stack;

// A binary tree node
class Node {

    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTree {

    Node root;

    void iterativePreorder()
    {
        iterativePreorder(root);
    }

    // An iterative process to print preorder traversal of Binary tree
    void iterativePreorder(Node node)
    {

        // Base Case
        if (node == null) {
            return;
        }

        // Create an empty stack and push root to it
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);

		/* Pop all items one by one. Do following for every popped item
		a) print it
		b) push its right child
		c) push its left child
		Note that right child is pushed first so that left is processed first */
        while (nodeStack.empty() == false) {

            // Pop the top item from stack and print it
            Node mynode = nodeStack.peek();
            System.out.print(mynode.data + " ");
            nodeStack.pop();

            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
    }

    void iterativeInorder(Node node){

        Stack<Node> stack= new Stack<>();
        stack.push(node);
        Node current=node.left;
while(current!=null || !stack.isEmpty()) {

    while (current != null) {
        stack.push(current);
        current = current.left;
    }
    current=stack.pop();
    System.out.print(current.data+" ");
    current=current.right;

}

    }

    // driver program to test above functions
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        //tree.iterativePreorder(tree.root);
        tree.iterativeInorder(tree.root);
    }
}

// This code has been contributed by Mayank Jaiswal
