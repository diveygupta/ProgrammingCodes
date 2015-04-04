// Find Kth smallest/largest element in array

// algo1
// create a min heap and call extractMin(heap) k times

// algo2
// use select algorithm which is variation of quick sort



public class Test{
	private static  void QuickSelect(int[] arr, int left, int right, int k) {
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	 
	      /* partition */
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      }
	 
	      /* recursion */
	      if (k <= j && left < j) // only this line changes compared to quick sort algo
	    	  QuickSelect(arr, left, j , k);
	      else if(i < right)
	    	  QuickSelect(arr, i, right, k);
	}

	public static void main(String[] args){

		int[] arr={17,3,1,4,9,5,34};
		int k = 2;
		QuickSelect(arr,0,arr.length-1, k);
		 
	
		System.out.println(arr[k]);

	

	}			
		}

	
