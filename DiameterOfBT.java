//diameter of BT is equal to distance of two farthest nodes in BT which is not necessarily the two extreme leaves of root
//There are three cases to consider when trying to find the longest path between two nodes in a binary tree (diameter):

//1 The longest path passes through the root,
//2 The longest path is entirely contained in the left sub-tree,
//3 The longest path is entirely contained in the right sub-tree.
class Node
{
    int value;
    Node left;
    Node right;
}

public class DiameterOfBT {

    int HeightOfBT(Node root)
    {
        if(root == null)
            return 0;
        else return 1 + Math.max(HeightOfBT(root.left), HeightOfBT(root.right));
        
    }
    
    int Diameter(Node root)
    {
        if(root == null)
            return 0;
        else
        {
            int rootDia = 1 + HeightOfBT(root.left) + HeightOfBT(root.right);
            int leftSubTreeDia = Diameter(root.left);
            int rightSubTreeDia = Diameter(root.right);
            
            return Math.max(rootDia, Math.max(leftSubTreeDia, rightSubTreeDia));
        }
    }
    
}
