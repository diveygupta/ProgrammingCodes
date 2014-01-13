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
 
 
public class ifBTisBST {

    private static void Inorder(Node root, ArrayList<Integer> list)
    {
        if(root == null) return;
        Inorder(root.left,list);
        list.add(root.value);
        Inorder(root.right,list);
        
        
    }
    
    //algo1 //do inorder of BT into an array & then check if array is sorted or not
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
    
    
    
    //algo2 node value should be > min & < max
    private static Boolean check2(Node root, int min,int max)
    {
        if(root == null)
            return true;
        
        if(root.value <= min || root.value > max) 
            return false;
        
        if(!check2(root.left, min,root.value ) || !check2(root.right,root.value,max))
            return false;
        
        return true;
    }
    
    
    public static void main(String[] args) {
        
        //Node root is head of BT 
        check2(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
