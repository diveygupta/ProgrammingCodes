import java.util.Arrays;


public class LongestPalindromicSubstring {

    
    public static void main(String[] args) {
        
        String s = "racecar";
        
        find1(s);
        find2(s);
        
    }
    
    private static  boolean Palindrome(String str)
    {
        int len=str.length();
        for(int i=0;i<len/2;i++)
        {
            if(str.charAt(i)!=str.charAt(len-i-1))
                return false;
        }
        return true;
    }
    
    //algo1 brute force
    private static void find1(String s) {
       
        int len = s.length();
        String longest = "";
        //find all substrings of len 1 to n and check if it is a palindrome or not  
        for(int i = 1; i <= len;i++)
        {
           //find substrings of length i in s
            for(int j = 0; j <= len-i;j++)
            {
                String sub = s.substring(j, j+i);
                if(Palindrome(sub))
                {
                    longest = sub;
                    break;
                }
            }
        }
        
        System.out.println(longest);
    }
    
    //algo2 DP
    private static void find2(String s) {
        
        int strLen = s.length();
        int maxLen = 1, begin = 0;
        //table[i][j] represents if substring between i and j is palindrome or not
       boolean[][] table = new boolean[s.length()][s.length()];
       
       for(int i = 0; i < strLen; i++)
       Arrays.fill(table[i], false); 
       
       //all substring of len 1 is true
       for(int i = 0; i < strLen ;i++)
           table[i][i] = true;
       
       //calc if substring of len 2 is palindrome or not
       for(int i = 0; i < strLen-1; i++)
           {
               if(s.charAt(i) == s.charAt(i+1))
               {
                   table[i][i+1] = true;
                   begin = i;
                   maxLen = 2;
               }
           
           }

       ////calc if substring of len 3 to strLen is palindrome or not
       for(int len = 3; len <= strLen; len++)
       {
           for(int i = 0; i < strLen+1-len;i++)
           {
               int j = i+len-1;
               if(s.charAt(i) == s.charAt(j) && table[i+1][j-1])
               {
                   table[i][j] = true;
                   begin = i;
                   maxLen = len;
               }
           }
       }
       
     System.out.println(s.substring(begin,begin+maxLen));  
       
    }
}
