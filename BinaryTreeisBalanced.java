private static boolean BinaryTreeisBalanced(Node root)
	{
		if(root=null)
			return true;
		int diff=Math.abs(getHeight(root.left)-getHeight(root.right));
		
		  if(diff>1)
			  return false;
		  else 
			  return BinaryTreeisBalanced(root.left) &&  BinaryTreeisBalanced(root.right);
	  
	}
	
	int getHeight(Node root)
	{
		if(root==null) return 0;
		return 1+Math.max(getHeight(root.getLeft()),getHeight(root.getRight()));
		}