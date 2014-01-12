import java.util.ArrayList;
import java.util.Stack;


class customStack extends Stack<Integer>{
    
    int maxSize;
    int size;
    
    customStack()
    {
        maxSize = 100;
        size = 0;
    }
    
    public int getSize()
    {
    return this.size;    
    }
    
    public void push(int value)
    {
        size++;
        super.push(value);
    }
    
    public Integer pop()
    {
        size--;
        return super.pop();
    }
    
}

public class SetOfStacks {

    ArrayList<customStack> listStack = new ArrayList<customStack>();
    
    public void push(int value)
    {
        if(listStack.size() == 0)
        {
            customStack cs = new customStack();
            cs.push(value);
            listStack.add(cs);
        }
        else
        {
            int s = listStack.size();
            customStack c = listStack.get(s-1);
            if(c.getSize() == c.maxSize)
            {
                customStack cs = new customStack();
                cs.push(value);
                listStack.add(cs);
            }
            else
                c.push(value);
        }
    }
    
    public int pop() throws Exception
    {
        int s = listStack.size();
        if(s == 0)
            throw new Exception("all stacks empty");
        customStack c = listStack.get(s-1);
        int v= c.pop();
        if(c.size == 0)
            listStack.remove(s-1);
        return v;
    }
    
}
