public void dfs()
{
	//DFS uses Stack data structure
	Stack s=new Stack();
	s.push(this.rootNode);
	rootNode.visited=true;
	printNode(rootNode);
	while(!s.isEmpty())
	{
		Node n=(Node)s.peek();
		Node child=getUnvisitedChildNode(n);
		if(child!=null)
		{
			child.visited=true;
			printNode(child);
			s.push(child);
		}
		else
		{
			s.pop();
		}
	}
	//Clear visited property of nodes
	clearNodes();
}


/////////////dfs for BT
//dfs on a binary tree is the same one with preorder traversal 
public void dfs2(Node root)
{
	//DFS uses Stack data structure
	if(root == null)
		return;
	Stack s=new Stack();
	s.push(root);
	printNode(root);
	while(!s.isEmpty())
	{
		Node n=(Node)s.peek();
		if(n.right != null)
		{
			printNode(n.right);
			s.push(n.right);
		}
		else if(n.left != null)
		{
			printNode(n.left);
			s.push(n.left);
		}
		else
		{
			s.pop();
		}
	}
	
}
