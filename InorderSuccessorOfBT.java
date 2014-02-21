class Node
{
    int value;
    Node left;
    Node right;
    Node parent;
}

public class InorderSuccessorOfBT {

    //if parent node is given
     Node getInorderSuccessor(Node node)
     {
        if (node == null) return null;
        
        if(node.right == null)
        {
            if(node == node.parent.left)
                return node.parent;
            else
            {
                while (node.parent != null && node == node.parent.right)
                {
                    node = node.parent;
                }
                return node.parent;
            }
        }
        else
        {
                Node temp = node.right;
                while(temp.left != null)
                      temp = temp.left;
                return temp;
            
        }
       
    }
    
}


