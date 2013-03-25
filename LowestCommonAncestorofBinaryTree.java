
//algo
/*
first do the inorder traversal
eg
The inorder traversal yields - 8, 4, 9, 2, 5, 1, 6, 3, 7

next do the postorder traversal
eg
And the postorder traversal yields - 8, 9, 4, 5, 2, 6, 7, 3, 1

So for instance, if we want to find the common ancestor of nodes 8 and 5, then we make a list of all the nodes which are between 8 and 5 in the inorder tree traversal, which in this case happens to be [4, 9, 2]. Then we check which node in this list appears last in the postorder traversal, which is 2. Hence the common ancestor for 8 and 5 is 2.

*/