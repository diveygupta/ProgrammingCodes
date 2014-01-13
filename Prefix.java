import java.util.Stack;
import java.util.StringTokenizer;

public class Prefix {
    
  public static void main(String[] args) {
    
          String expression = "- * / 15 - 7 + 1 1 3 + 2 + 1 1"; //  // "* + 1 2 3"

                try {
                        String temp = new StringBuffer(expression).reverse().toString();
                      System.out.println( evaluateExpression(temp) );
                    }
                catch (Exception ex) {
                      System.out.println("Wrong expression");
                    }
          }
  
  
/** Evaluate an expression **********************************************/
public static int evaluateExpression(String expression) {
    
            // Create operandStack to store operands
            Stack<Integer> operandStack = new Stack<Integer>();
            
            // Extract operands and operators
        StringTokenizer tokens = new StringTokenizer(expression, " +-/*%", true);
        
        // Phase 1: Scan tokens
        while (tokens.hasMoreTokens())
        {
              String token = tokens.nextToken().trim(); // Extract a token
             
              if (token.length() == 0)
              { // Blank space
                continue; // Back to the while loop to extract the next token
              }
              else if (token.charAt(0) == '+' || token.charAt(0) == '-' || token.charAt(0) == '*' || token.charAt(0) == '/') 
              {
                      processAnOperator(token.charAt(0), operandStack);
              }
              else
              {  // An operand scanned
                      // Push an operand to the stack
                  if(token.length() > 1) ///in case of 15 it got reversed to 51
                      token = new StringBuffer(token).reverse().toString();
                  operandStack.push(new Integer(token));
              }
         }
        // Return the result
        return ((Integer)(operandStack.pop())).intValue();
}


/** Process one operator: Take an operator from operatorStack and
   *  apply it on the operands in the operandStack */
  public static void processAnOperator(char op, Stack operandStack)
  {

        if (op == '+')
            {
              int op1 = ((Integer)(operandStack.pop())).intValue();
              int op2 = ((Integer)(operandStack.pop())).intValue();
              operandStack.push(new Integer(op2 + op1));
            }
        else if (op == '-')
            {
              int op1 = ((Integer)(operandStack.pop())).intValue();
              int op2 = ((Integer)(operandStack.pop())).intValue();
              operandStack.push(new Integer(op1 - op2));
            }
        else if ((op == '*'))
            {
              int op1 = ((Integer)(operandStack.pop())).intValue();
              int op2 = ((Integer)(operandStack.pop())).intValue();
              operandStack.push(new Integer(op2 * op1));
            }
        else if (op == '/') 
            {
              int op1 = ((Integer)(operandStack.pop())).intValue();
              int op2 = ((Integer)(operandStack.pop())).intValue();
              operandStack.push(new Integer(op1 / op2));
            }
  }
}