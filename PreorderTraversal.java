import java.util.*;

//with recursion
//node.value,node.left,node.right
public class Node{
Node PreorderTraversal1(Node root)
{
	if(root==null) return null;
	System.out.println(root.value);
	PreorderTraversal1(root.getLeft());
	PreorderTraversal1(root.getRight());
	}

//without recursion
void PreOrderTraversal2(Node root)
	{
		if(root==null) return;
		
		Stack<Node> st=new Stack<Node>();
		
		st.push(root);
		
		while(!st.isEmpty())
		{
			Node n=st.pop();
			System.out.println(n.getValue());
			if(root.getRight()!=null)
			st.push(n.getRight());
			if(root.getLeft()!=null)
			st.push(n.getLeft());
				
			
		}
		
		
		
	}