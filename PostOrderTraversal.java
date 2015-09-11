import java.util.*;


public class PostOrderTraversal {

    public void PostOrder(Node root) {
        
        if(root == null) return;
        
        Node n;
        
        Stack s = new Stack();
        
        s.push(root);
        
        while(!s.isEmpty())
        {
            n = s.peek(); 
            // 			finished subtrees 		 or			is leaf
            if(n.left == root || n.right == root || (n.left == null && n.right == null) )
            {
                System.out.println(n.value);
                s.pop();
                root = n;
            }
            else
            {
                if (n.right != null) 
                    s.push(n.right);
                  
                if (n.left != null) 
                    s.push(n.left);
                  
            }
        }
        
    }
    
}
