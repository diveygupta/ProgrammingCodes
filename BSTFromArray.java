import java.util.*;

class Node{
    
    int value;
    Node left;
    Node right;
    
    Node()
    {
        this.left = null;
        this.right = null;  
    }
    
    Node(int value)
    {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
}

public class BSTFromArray {

  
    //using iteration
    public  void createTree(Node root, int[] arr)
    {
    
        root = new Node(arr[0]);
        Node temp = root;
        for(int i = 1 ; i<arr.length;)
        {
            if(arr[i] <= temp.value)
            {
                if(temp.left == null)
                {
                    temp.left = new Node(arr[i]);
                    i++;
                    temp = root;
                }
                else
                    temp = temp.left;
            }
            else
            {
                if(temp.right == null)
                {
                    temp.right = new Node(arr[i]);
                    i++;
                    temp = root;
                }
                else
                    temp = temp.right;
            }
            
            
        }
        
        InOrderTraversal(root);
    }
    
  
    
    public static void InOrderTraversal(Node root)
    {
        if(root==null) return;
        
        InOrderTraversal(root.left);
        System.out.print(root.value + "\t");
        InOrderTraversal(root.right);
        
    }
    
    public  void insert(Node root,int[] arr)
    {

        createTree(root, arr);
 
    }
    
    public static void main(String[] args) {
        
        Node root = null;
        
        int[] arr = {4,7,4,8,5,2,8,5,3};
        
        BSTFromArray b = new BSTFromArray();
        
        b.insert(root,arr);

    }
}
