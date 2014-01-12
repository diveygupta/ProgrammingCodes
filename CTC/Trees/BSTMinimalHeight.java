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
 
public class BSTMinimalHeight {

    private static Node constructTree(int[] arr,int start,int end) {
     
        if(end < start) return null;
        
        int mid = (start + end)/2;
        Node n = new Node(arr[mid]);
        n.left = constructTree(arr, start, mid-1);
        n.right = constructTree(arr, mid+1, end);
        return n;
    }
    
    
    public static void main(String[] args) {
        
        int[] arr = {0,1,2,3,4,5,6,7};
        
        Node root = constructTree(arr, 0, arr.length-1);
        
    }
    
}
