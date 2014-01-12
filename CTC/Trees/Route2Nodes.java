import java.util.LinkedList;
import java.util.Queue;

public class Route2Nodes {

public enum State{Unvisited,Visiting,Visited}    
    
class Node{
    int value;
    Node left;
    Node right;
    State state;
}

    public Boolean Route(Node root, Node start, Node end)
    {
        
        if(root == null || start == null || end == null)
            return false;
        
        Queue<Node> q = new LinkedList<Node>();
        q.add(start);
        start.state = State.Visiting;
        Node n;
        while(!q.isEmpty())
        {
            n = q.remove();
            if(n != null)
            {
                for(Node v:getDirectedNodes())
                {
                    if(v == end)
                        return true;
                    else
                    {
                        v.state = State.Visiting;
                        q.add(v);
                    }
                    
                }
            }
            n.state = State.Visited;
        }
    return false;
    }
    
    
}
