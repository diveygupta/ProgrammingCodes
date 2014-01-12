
public class Array3Stacks {

    int arraySize = 300;
    int[] array = new int[arraySize];
    int stackSize = arraySize/3;
    int[] stackPositions = {-1,-1,-1};
    
    void push(int stackno, int value) throws Exception
    {
        if(stackPositions[stackno]+1 == stackSize)
            throw new Exception("overflow");
        else
        {
            stackPositions[stackno]++;
            array[stackno*stackSize + stackPositions[stackno]] = value;
        }
    }
    
    int pop(int stackno) throws Exception
    {
        if(stackPositions[stackno] == -1)
            throw new Exception("stack empty");
        else
        {
            int value = array[stackno*stackSize + stackPositions[stackno]];
            array[stackno*stackSize + stackPositions[stackno]] = -1;
            stackPositions[stackno]--;
            return value;
        }
    }
    
}
