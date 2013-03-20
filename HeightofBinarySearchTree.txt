int getHeight(Node root)
{
	if(root==null) return 0;
	return 1+Math.max(getHeight(root.getLeft(),getHeight(root.getRight())));
	}