import java.io.*;
import java.util.*;

//useing inorder creates ambiguity in case of balanced and unbalnaced tree
//if we do a post-order traversal, we will output the leaf nodes before its parent node
//pre-order is the best way bcoz we write the parent first

class Node
{
    int value;
    Node left;
    Node right;
}

public class SerializeDeserializeBT 
{
    FileWriter bw;
    Scanner rw;
    
    SerializeDeserializeBT()
    {
        try 
        {
            bw = new FileWriter("c:\\bt.txt");
            rw = new Scanner(new BufferedReader(new FileReader("c:\\bt.txt")));
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    
    void SerializeBT(Node root) throws Exception
    {
        writeBTtoFile(root); 
        bw.close();
    }
    
    void DeSerializeBT(Node root)
    {
        readBTfromFile(root);  
    }
    
    private void writeBTtoFile(Node root) throws Exception
    {
        
        if(root == null)
        {
            bw.write("#");
        }
        else
        {
            bw.write(root.value);
            bw.write(" ");
            writeBTtoFile(root.left);
            writeBTtoFile(root.right);
        }
    }
    
    private void readBTfromFile(Node n)
    {
     String token = rw.next();
     
    if(token == "#" )
    {
        return;
    }
    else
    {
        n = new Node();
        n.value = Integer.parseInt(token);
        readBTfromFile(n.left);
        readBTfromFile(n.right);
    }
        
    }
}
