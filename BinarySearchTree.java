Node getNode(Node root,int value)
{
	if(root==null) return null;
	if(root.value==value)
	     return root;
	else if(root.value>value)
	     getNode(root.getLeft(),value);
	else getNode(root.getRight(),value);
}