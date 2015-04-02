public static void main(String[] args) {
		
		String arr[]=new String[5];
		arr[0]="aaaabbcdcc";
		arr[1]="bcd";
		arr[2]="abcdcc";
		arr[3]="abbcd";
		arr[4]="abbcd";

		String n=arr[0];
		for(int i=0;i<5;i++)
	    	n=Test.LongestCommonSubstring(arr[i],n);
			
		System.out.println(n);

	}

//brute force
 public static String LongestCommonSubstring(String S1, String S2) {
         int Start = 0;
         int Max = 0;
         for (int i = 0; i < S1.length(); i++){
            for (int j = 0; j < S2.length(); j++){
               int x = 0;
               while (S1.charAt(i + x) == S2.charAt(j + x)){
                  x++;
                  if (((i + x) >= S1.length()) || ((j + x) >= S2.length())) 
                     break;
               }
               if (x > Max) {
                  Max = x;
                  Start = i;
               }
            }
         }
         return S1.substring(Start, (Start + Max));
    }


//another solution is to find string with the least length, then check any substring of it is present in all the remaining strings
 
 
//suffix tree
