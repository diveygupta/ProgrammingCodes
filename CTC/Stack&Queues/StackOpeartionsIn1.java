
class Node{
    
    int value;
    Node next;
    int min;
}

public class StackOpeartionsIn1 {

    Node top;
    
    void push(int value)
    {
        
        Node n = new Node();
        n.value = value;     
        n.min = Math.min(value, min());
        n.next = top;
        top = n;
        
    }
    
    int pop() throws Exception
    {
        if(top != null)
            {
            int v = top.value;
            top = top.next;
            return v;
            }
        else
            throw new Exception("stack empty");
    }
    
    int peek()
    {
        return top.value;
    }
    
    int min()
    {
        return top.min;
    }
}
