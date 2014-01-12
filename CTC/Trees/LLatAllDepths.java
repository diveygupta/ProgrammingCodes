import java.util.*;

 class Node{
        int value;
        Node left;
        Node right;
        
        public Node(int value)
        {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
 
public class LLatAllDepths {

    
    private static void createLL(Node root,ArrayList<LinkedList<Node>> list) {
     
        LinkedList<Node> l = new LinkedList<Node>();
        l.add(root);
        list.add(l);
                
        while(l.size()>0)
        {
            LinkedList<Node> current = new LinkedList<Node>();
            for(Node n:l)
            {
                if(n.left != null)
                    current.add(n.left);
                if(n.right != null)
                    current.add(n.right);
            }
            list.add(current);
            l = current;
        }

    }
    
    public static void main(String[] args) {
        
        ArrayList<LinkedList<Node>> list = new ArrayList<LinkedList<Node>>();
        
        createLL(root,list);
        
    }
    
}
