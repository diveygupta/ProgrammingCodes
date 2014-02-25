import java.util.Arrays;


public class HeapSort {

     int heapSize;
    
     int LeftChild(int i)
     { 
         return 2*i+1;
     }

     int RightChild(int i)
     {
         return 2*i+2;
     }

     void GenerateMaxHeap(int[] arr)
     {
         heapSize = arr.length;
         
         for(int i = arr.length/2; i >= 0;i--)
             MaxHeapify(arr,i); //call heapify on all nodes except leaves
     }
     
     void MaxHeapify(int[] arr,int i)
     {
         //check to see if child of i is greater than i
         int index = i;
         int l = LeftChild(i);
         int r = RightChild(i);
         
         if(l < heapSize && arr[l] > arr[index] )
             index = l;
         
         if(r < heapSize && arr[r] > arr[index] )
             index = r;
         
         //if arr[i] is smaller than any of its child then swap it
         if(index != i)
         {
             int temp = arr[index];
             arr[index] = arr[i];
             arr[i] = temp;
             
             MaxHeapify(arr, index); //recursively correct the affected sub tree
         }
     }
     
    void Sort(int[] arr) {

        // generate heap first
        GenerateMaxHeap(arr);
        
        //swap top element which is highest with the last index
      //  heapSize--;
        for(int i = arr.length-1; i>=0;i--)
        {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            
            heapSize--; //decrease heap size so last value isn't affected now
            MaxHeapify(arr, 0);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        
        int[] arr={1,5,4,9,78,987,5,34,44,23,32,23,43};
        
        HeapSort h = new HeapSort();
        h.Sort(arr);
         
        System.out.println(Arrays.toString(arr));
  
        
    }

    
}
