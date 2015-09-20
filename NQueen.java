public class test {
    public static void main(String[] args) {
        Queens q = new Queens(5);
        if(!q.solve(0)) {
            System.out.println("No soln");
        }

        q.printBoard();
    }

}

class Queens {
    int size;
    int board[][];

    public Queens(int size) {
        this.size = size;
        board = new int[size][size];
        initBoard();
    }

    private void initBoard() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                board[row][col] = 0;
            }
        }
    }

    /* A utility function to check if a queen can be placed on board[row][col]
    Note that this function is called when "col" queens are already placeed
    in columns from 0 to col -1. So we need to check only left side for
    attacking queens */
    private boolean canBePlaced(int row, int col) {
        /* Check this row on left side */
        for (int i = 0; i < col; i++) {
            if(board[row][i] == 1) {
                return false;
            }
        }

        /* Check upper diagonal on left side */
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 1) {
                return false;
            }
        }

        /* Check lower diagonal on left side */
        for (int i = row, j = col; i < size && j >= 0 ; i++, j--)  {
            if(board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public boolean solve(int col) {
        /* base case: If all queens are placed then return true */
        if (col >= size) {
            return true;
        }

        /* Consider this column and try placing this queen in all rows
        one by one */
        for (int i = 0; i < size; i++) {
            if(canBePlaced(i, col)) {
                /* Place this queen in board[i][col] */
                board[i][col] = 1;
                /* recur to place rest of the queens */
                if(solve(col+1)) {
                    return true;
                }

                /* If placing queen in board[i][col] doesn't lead to a solution
                then remove queen from board[i][col] */
                board[i][col] = 0; // BACKTRACK
            }
        }

        return false;
    }

    public void printBoard() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(board[row][col] + "\t");
            }
            System.out.println();
        }
    }
}