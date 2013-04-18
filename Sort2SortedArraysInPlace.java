import java.util.*;

//with recursion
//node.value,node.left,node.right
public class Test{

	
	public static void main(String[] args){
			int i;
			int a[] = { 1, 4, 5, 7, 8, 9, 2, 3, 6, 10, 11 };//contains 2 sorted arrays
			for (i = 1; i < 11; i++) {
				if (a[i - 1] < a[i]) {
					continue;
				} else {
					int val = a[i];
					for (int k = i - 1; k >= 0; k--)
						if (a[k] > val) {
							a[k + 1] = a[k];
						} else {
							a[k + 1] = val;
							break;
						}
				}
			}
			for (i = 0; i < 11; i++)
				System.out.print(a[i] + "\t");

		

	}
}