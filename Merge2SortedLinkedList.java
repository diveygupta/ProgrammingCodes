//recursive
public static Node merge(Node n1, Node n2) 
{
    if (n1 == null) return n2;
    if (n2 == null) return n1;

    if (n1.value < n2.value) 
	{
        n1.next = merge(n1.next, n2);
        return n1;
    }
	else
	{
        n2.next = merge(n2.next, n1);
        return n2;
    }
}


//iterative
public static Node merge(Node n1, Node n2) {
    if (n1 == null) return n2;
    if (n2 == null) return n1;

    Node head, current;
	
	//set head
    if(n1.value < n2.value)
		{
			head = n1;
			n1 = n1.next;
		}
	else
		{
			head = n2;
			n2 = n2.next;
		}

		//save head and change current
		current = head;
	while(n1 != null && n2 != null)
		{
			if(n1.value < n2.value)
				{
					current.next = n1;
					n1 = n1.next;
				}
			else
				{
					current.next = n2;
					n2 = n2.next;
				}
			current = current.next;
		
		}
		
		//point remaining elemnts
		if(n1 != null)
			current.next = n1;
		if(n2 != null)
			current.next = n2;
		
		
	return head;
}
