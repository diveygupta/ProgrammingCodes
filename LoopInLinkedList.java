
import java.util.*;

public class Test {

	boolean findLoop(Node head)
	{
		if(head == null)
			return false;
		
		Node slow, fast;
		slow=fast=head;
		
		while(slow != null)
		{
			slow = slow.getNext();
			
			if(fast.getNext() != null)
			   fast = fast.getNext().getNext();
			else
				return false;
			
			if(slow == fast)
				return true;
			
		}
		
		return false;
		
	}
	
	
    public static void main(String[] args) {
    	
    }   
    
}