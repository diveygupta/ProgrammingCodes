public void DFS_Recursive(Stack stack) {
        // DFS uses Stack data structure
        if (stack.empty()) return;
        Node node = (Node) stack.peek();
        if (visited.get(node)==null) System.out.println(node);
        visited.put(node, true);
        Node child = getUnvisitedChildNode(node);
        if (child != null) {
            stack.push(child);
        } else {
            stack.pop();
        }
        DFS_Recursive(stack);
    }

public void DFS()
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
//generally dfs for BT can be done in any of the traversal(inorder/preorder/postorder)
//following dfs on a binary tree is the same one with preorder traversal 
public void dfsForBT(Node root)
{
	//DFS uses Stack data structure
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
