
public class TicTacToe {

    //3X3
    private static char whoWon1(char[][] board)
    {
            
        for(int i = 0; i<3; i++)
        {
            //check rows
            if(board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return board[i][0];
            
            //check cols
            else if(board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return board[0][i];
            
            //check diagonal straight
            else if(board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
                return board[0][0];
            
            //check diagonal reverse
            else if(board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[0][0])
                return board[0][2];
            
            
        }
        return (Character) null;
    }
    
    //nXn
    private static char whoWon2(char[][] board)
    {
        int len = board.length;
        int i=0, j=0;
        for(i = 0; i<len; i++)
        {
            //check rows
            if(board[i][0] != ' ')
            {
                for(j = 0; j<len-1; j++)
                {
                    if(board[i][j] != board[i][j+1])
                        break;
                }
                if(j == len-1)
                return board[i][0];
            }
            
            
            //check cols
            if(board[0][i] != ' ')
            {
                for(j = 0; j<len-1; j++)
                {
                    if(board[j][i] != board[j+1][i])
                        break;
                }
                if(j == len-1)
                return board[0][j];
            }            
            
            //check diagonal straight
            if(board[0][0] != ' ')
            {
                
                if(i+1 < len && board[i][i] != board[i+1][i+1])
                        break;
              
                if(i == len-1)
                return board[0][0];
            }   
            
            //check diagonal reverse
            if(board[0][len-1] != ' ')
            {
                
                if(i+1 < len && board[i][len-i-1] != board[i+1][len-i-2])
                        break;
              
                if(i == len-1)
                return board[0][len-1];
            }
            
            
        }
        return (Character) null;
    }
    
}
