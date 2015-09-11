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


// reverse LL in pairs eg 1->2->3->4->5->6->X   into   2->1->4->3->6->5->X   where X can be infinite list
// STeps 1->2->3->4->5->6->X
// 2->1->3->4->5->6->X
// 2->1->4->3->5->6->X and so on
	public static Node swap(Node head) {
	    Node p = null;
	    Node newHead = null;
	    while (head != null && head.next != null) {
	    	
	    	// skipped for the first time
	        if (p != null) {
	            p.next.next = head.next;
	        }
	 
	        p = head.next;
	        head.next = head.next.next;
	        p.next = head;
	        
	        //only executed once at start to store new head which is always 2nd node 
	        if (newHead == null)
	            newHead = p;
	        
	        head = head.next;
	    }
	    return n;
}