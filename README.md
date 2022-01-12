
# Description

A program that reads a file line by line and sorts its content in ascending and descending order based on alphabetical order. Each line is added in 
a binary tree in a sorted manner. If the data to be added is smaller than the data of the parent node, add to the left child. Else, the right.
To obtained a list which is sorted in alphabetical order, the program does an 'inorder' traversal of the tree. While printing the data in ascending order, each line
printed is added to a stack. Since the data being added to the stack is in ascending order, popping the stack will return the list in reverse order (descending).
