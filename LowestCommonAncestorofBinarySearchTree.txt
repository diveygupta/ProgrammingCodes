Node LowestCommonAncsestor(Node root,int val1,int val2)
{
if(root==null) return null;
if(val1<root.value && val2>root.value)
	return root;
else if(val1<root.value && val2<root.value)
	LowestCommonAncsestor(root.getLeft(),val1,val2);
else    LowestCommonAncsestor(root.getRight(),val1,val2);

}
