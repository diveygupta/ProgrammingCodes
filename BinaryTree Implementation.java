import java.util.*;

public class Node {

	private Node left;
	private int value;
	private Node right;
	
   private Node(Node left,int value,Node right){
	   this.left=left;
	   this.value=value;
	   this.right=right;
   }
   
   public Node getLeft(){
	   return left;
   }
   
   public int getValue()
   {
	   return value;
   }

   public Node getRight()
   {
	   return right;
   }
}