public void BFS()
{
	
	Queue q=new LinkedList();
	q.add(this.rootNode);
	printNode(this.rootNode);
	rootNode.visited=true;
	while(!q.isEmpty())
	{
		Node n=(Node)q.remove();
		Node child=null;
		while((child=getUnvisitedChildNode(n))!=null)
		{
			child.visited=true;
			printNode(child);
			q.add(child);
		}
	}
	//Clear visited property of nodes
	clearNodes();
}


//////////////algo for BT
	 public void BFS2()
	 { 
	 	Queue q = new LinkedList();
	 	Node item;
		if(root == null)
			return;
	 		q.add(root);
	 		while(!q.isEmpty() )
	 		{
	 			item = (Node)q.remove();
	 			System.out.println(item);
	 			if(item != null)
	 			{
	 				if(item.left != null)
	 				{
	 					q.add(item.left);
	 				}
	 				if(item.right != null)
	 				{
	 					q.add(item.right);
	 				}
	 			}
	 		}
	 }