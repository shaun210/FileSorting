
public class BinaryTree {
    bNode root = null; 
    
    /**
     * addNode
     * 
     * Add a node to the tree based on its data
     * 
     * @param   String line   Data to be added
     * @return  nothing
     */
        
    public void addNode(String line) {
        bNode current;
        
        if(root == null) { // empty tree
            root = makeNode(line);
        }
        // If not empty, descend to the leaf node according to
        // the input data.
        
        else {
            current = root;
            while(true) {
                if(line.compareToIgnoreCase(current.data)<0) {
                    // New data < data at node, branch left
                    if(current.left == null) { 
                        current.left = makeNode(line); // attach new node here
                        break;
                    }
                    else {                      
                        current = current.left; // keep traversing
                    }
                }
                // New data >= data at node, branch right
                else {
                    if(current.right == null) {
                        current.right = makeNode(line);
                        break;
                    }
                    else {                       // otherwise
                        current = current.right; // keep traversing
                    }
                }
            }
        }
    }
    /**
     * makeNode
     * 
     * Creates a single instance of a bNode
     * 
     * @param   String line   Data to be added
     * @return  bNode node Node created
     */

    bNode makeNode(String data) { 
        bNode node = new bNode(); // create object 
        node.data = data;         // initialise new data field
        node.left = null;         // set both successors to null
        node.right = null;
        return node;              // return handle to new object
    }
    
    
    public void inorder() {
    
        traverse_inorder(root);
    }
    
    public void traverse_inorder( bNode root) {
        if(root.left != null) {
          traverse_inorder(root.left);
        }
        String j = root.data; //store each data in a root
        System.out.println(j);
        FileSorting.myStack.push(j); // adding the line in order
              
        if(root.right != null) traverse_inorder(root.right);
    }
}


class bNode{ // a simple bNode class for use by bTree
    String data;
    bNode left;
    bNode right;
    
}