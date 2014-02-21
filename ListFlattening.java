class Node{
    int value;
    Node next,prev,child;
}
public class ListFlattening {

    void flattenList(Node head, Node tail)
    {
        Node temp = head;
        
        while(temp != null)
        {
            if(temp.child != null)
            {
                tail.next = temp.child;
                temp.child.prev = tail;
                Node c = temp.child;
                while(c.next != null)
                {
                    c= c.next;
                }
                tail = c;
            }
        temp = temp.next;    
        }
        
    }
    
    void unflattenList(Node head, Node tail)
    {
        Node temp = head;
        exploreChild(temp);
        while(temp.next != null)
            temp = temp.next;
        tail = temp;
        
    }
    
    void exploreChild(Node cur)
    {
        Node temp = cur;
        while(temp != null)
        {
            if(temp.child != null)
            {
            temp.child.prev.next = null;
            temp.child.prev = null;
            exploreChild(temp.child);
            }
            temp = temp.next;
        }
        
    }
}
