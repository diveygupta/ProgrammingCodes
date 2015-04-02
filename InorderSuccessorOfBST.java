/*
Steps: w/o parent pointer
i) If the right subtree of node x is not empty then the successor of x is just the leftmost node in the right subtree.
ii) If the right subtree of node x is empty then start from the root and keep doing following
	a. if the root value is greater than node value then go to left subtree.
	b. if the root value is less than node value then go to right subtree.
	c. Stop when we reach the node.
*/

public class InorderSuccessorOfBST {

    Node getInorderSuccessor(Node root, int search)
    {
        if(root == null)
            return null;
        
        Node succ = null;
        Node current = root;
        
        // first find the node that has vaule=search
        while(current.value != search)
        {
            if(current.value > search)
            {   
                succ = current;
                current = current.left;
            }
            else
                current = current.right;
        }
        
        // If right node is present than Traverse from that node to left most node of that child 
        if(current != null && current.right != null)
        {
            Node temp = current.right;
            while(temp.left != null)
                temp = temp.left;
            succ = temp;
        }
        
        return succ;
        
    }
    
}
