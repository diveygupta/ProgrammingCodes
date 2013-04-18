public static Node ReverseLinkedList(Node head){
Node p,n,temp;
p=NULL;
n=NULL;
temp=head;
	while(temp!=NULL)
	{
	p=n;
	n=temp;
	temp=temp.getNext();
	n.setNext(p);
	}
return n;
}