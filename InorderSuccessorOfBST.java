
public class InorderSuccessorOfBST {

    Node getInorderSuccessor(Node root, int value)
    {
        if(root == null)
            return null;
        
        Node succ = null;
        Node current = root;
        
        while(current.value != value)
        {
            if(current.value > value)
            {   
                succ = current;
                current = current.left;
            }
            else
                current = current.right;
        }
        
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
