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
Node PreorderTraversal2(Node root)
{
	if(root==null) return null;
	Stack <Node> st=new Stack<Node>();
	st.push(root);
	while(st.size()>0)
	{
	System.out.println(st.pop().value);
	if(root.getRight!=null)//right is pushed first so that its popped after left
	st.push(root.getRight());
	if(root.getLeft!=null)
	st.push(root.getLeft());
	}
	}
}