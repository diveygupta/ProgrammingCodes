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


///without using temp
Node reverse(Node n,Node p){   
    if(n==null) return null;
    if(n.next==null){ //if this is the end of the list, then this is the new head
    n.next=p;
    return n;
    }
    Node r=reverse(n.next,n);  //call reverse for the next node, 
                                  //using yourself as the previous node
    n.next=p;                     //Set your next node to be the previous node 
    return r;                     //Return the head of the new list
}