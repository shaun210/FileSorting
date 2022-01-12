
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class FileSorting {
    
    public static Stack<String> myStack = new Stack<String>();
    static BinaryTree myTree = new BinaryTree();
    
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        
// Prompt user for a file name.  If no name is entered, terminate
// the program, otherwise attempt to open the file. If file open
// is not successful, prompt again for a new name.  Keep doing this
// until successful open, or a blank line is entered.
        
        System.out.println("Simple File Listing Program");
        Scanner sc = new Scanner(System.in);
        BufferedReader rd = null;
        
        while(rd == null) {
            System.out.print("Enter name of file to list: ");
            String filename = sc.nextLine();
            if (filename.equals("")) {
                System.out.println("Program terminated");
                System.exit(0);                                 // Exit
            }
// Try to open the specified file
            try {
                rd = new BufferedReader(new FileReader(filename));
            }
            catch (IOException ex) {
                System.out.println("Unable to open file, try again.");
            }
        }

// Read the file a line at a time into a string.  Print as read to the output display.
        
        System.out.println("");
        try {
            while (true) {
                String line = rd.readLine();                            // Read a line of text
                if (line == null) break;                                // Exit if at end of file
                myTree.addNode(line);
            }                                                       // current line
        }
        catch (IOException ex) {
            System.out.println("I/O Error - program terminated");
            System.exit(-1);
        }
        System.out.println("File in sort order: \n\n");
        myTree.traverse_inorder(myTree.root);  // calls inorder method
        System.out.println("\n\nFile in reverse order:\n\n");
        String reverse;
        /* popping out the data. putting file in reverse order */
        while((reverse = myStack.pop()) != null) {
            System.out.println(reverse);
            
        }
        
        System.out.println("\n\nProgram terminated");

    }
}
