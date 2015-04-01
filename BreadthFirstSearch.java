// recursive
public void BFS_Recursive(Queue queue) {
        // BFS uses Queue data structure
        if (queue.isEmpty()) return;
        Node node = (Node) queue.remove();
        System.out.println(node);
        visited.put(node, true);
        for (Node child: node.child) {
            queue.add(child);
        }
        BFS_Recursive(queue);
    }

 // iterative 1
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

// iterative2
//////////////algo for Binary Tree(BT)
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