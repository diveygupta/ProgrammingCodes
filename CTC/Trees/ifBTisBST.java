import java.util.ArrayList;

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
 
 //do inorder of BT into an array & then check if array is sorted or not
public class ifBTisBST {

    private static Boolean check(Node root)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Inorder(root,list);
        
        if(list.size() == 0)
            return true;
        
        int prev = list.get(0);
        for(int i:list)
        {
            if(prev > i)
                return false;
            prev = i;
        }
        return true;
    }
    
    private static void Inorder(Node root, ArrayList<Integer> list)
    {
        if(root == null) return;
        Inorder(root.left,list);
        list.add(root.value);
        Inorder(root.right,list);
        
        
    }
    
}
