
public class T2SubTreeOfT1 {

    //algo1
    //find Inorder of Preorder of T1 & T2
    //if (Inorder of T2 isSubstring of T1) && (Preorder of T2 isSubstring of T1) then true
    
    //algo2
    //If root of T2 matches any node of T1 then check if T1 has the subtree or not
    
    private static Boolean isSubtree(Node T1, Node T2)
    {
        if(T2 == null ) return true;
        if(T1 == null ) return false;
        
        if(T1.value == T2.value)
             return matchTree(T1,T2);
        
        return isSubtree(T1.left,T2) || isSubtree(T1.right, T2);
        
        
    }

    private static Boolean  matchTree(Node t1, Node t2) {
        
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        if(t1.value != t2.value) return false;
        
       return matchTree(t1.left,t2.left) && matchTree(t1.right, t2.right);
        
    }
    
    
}
