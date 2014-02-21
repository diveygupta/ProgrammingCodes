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

public class BTFromArray {

   // static Node root;
    Queue<Node> q = new LinkedList<Node>();
    
    public  void createTree(Node root, int[] arr)
    {
        root = new Node(arr[0]);
        q.add(root);
        Node n;
        n = q.remove();
        for(int i = 1; i<arr.length;i++)
        {
            
            if(n.left == null)
            {
                n.left = new Node(arr[i]);
                q.add(n.left);
            }
            else
            if(n.right == null)
            {
                n.right = new Node(arr[i]);
                q.add(n.right);
                n = q.remove();
            }
        }
        
        InOrderTraversal(root);
    }
    
    public  Node createTree2(int[] arr,int i)
    {
        Node  temp = null;
        
        if(i < arr.length)
        {
            temp = new Node();
            temp.left = createTree2(arr, 2*i+1);
            temp.value = arr[i];
            temp.right = createTree2(arr, 2*i+2);
        }
        return temp;
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
        //method1
        createTree(root, arr);
        
        //method2
        System.out.println();
        Node root2 = createTree2(arr,0);
        InOrderTraversal(root2);
    }
    
    public static void main(String[] args) {
        
        Node root = null;
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        
        BTFromArray b = new BTFromArray();
        
        b.insert(root,arr);

    }
}
