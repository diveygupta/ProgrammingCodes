/*A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.
Write a function:
class Solution { public int solution(String S); }
that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
Assume that:
N is an integer within the range [0..200,000];
string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".*/


    
import java.util.Stack;


public class Test {
	
	public static void main(String[] args) {
		//int[] arr = {3,1,2,1,3};
	String S = "[](";
	 int res = solution(S);
		//for(int i:res)
			System.out.print(res);
	}
	
	public static int solution(String S) {
		if(S.isEmpty()) {
			return 1;
		}
		/*Put every opening bracket on a stack.
		 *  If a closing bracket is not the same as the top stack bracket, the string is not properly nested.*/
		int res = 0;
		Stack<Character> st = new Stack<Character>();
		for(int i =0;i<S.length();i++) {
			char c = S.charAt(i);
			if(c == '(' || c == '{' || c == '[') {
				st.push(c);
			} else if(c == ')' || c == '}' || c == ']') {
				if(st.isEmpty()) {
					return res;
				}
				boolean valid = correctPair(st.peek(),c);
				if(!valid) {
					return res;
				} else {
					st.pop();
				}
			}
		}
		
		if(!st.isEmpty()) {
			return res;
		}
		
		return 1;
    }
	
	public static boolean correctPair(char a, char b) {
		if(a == '(' && b == ')')
			return true;
		if(a == '{' && b == '}')
			return true;
		if(a == '[' && b == ']')
			return true;
		
		return false;
	}
		
    }
	
    
