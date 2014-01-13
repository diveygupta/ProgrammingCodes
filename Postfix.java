import java.util.Stack;
import java.util.StringTokenizer;

public class Postfix {
    
  public static void main(String[] args) {
    
          String expression = "1 2 + 3 *"; //   "5 1 2 + 4 * + 3 -"

                try {
                      System.out.println( evaluateExpression(expression) );
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
              operandStack.push(new Integer(op2 - op1));
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
              operandStack.push(new Integer(op2 / op1));
            }
  }
}