
public class TicTacToe
{
    //INSTANCE FIELD
    private int[][] board;

    //Constructor
    public TicTacToe(int[][] b)
    {
        board = b;
    }

    //Prints out the board
    public static void printBoard(int[][] arr)
    {
        System.out.print("\f");
        System.out.println("\t  Tic Tac Toe\n");
        for (int r = 0; r <= arr.length; r++)
        {
            for (int c = 0; c <= arr[1].length; c++)
            {
                if(r==0)
                {
                    if(c==0)
                    {
                        System.out.print(" \t");
                    }
                    else
                        System.out.print((c-1)+" \t");
                }
                else if(c==0)
                {
                    System.out.print((r-1)+" \t");
                }
                else
                {
                    for(int rr=0;rr<arr.length;rr++)
                    {
                        if(arr[r-1][rr]==1)
                        {
                            System.out.print("❌ \t");
                            c++;
                        }
                        else if(arr[r-1][rr]==2)
                        {
                            System.out.print("⭕️‍‍‍‍ \t");
                            c++;
                        }
                        else
                        {
                            System.out.print("◼️\t");
                            c++;
                        }
                    }

                }
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }

    }

    // Put down the player's number in specific spot
    // Return false if spot is taken, true otherwise
    // Example:  makeMove(2,1,0) puts a Player 2 in the coordinate(1,0)
    public boolean makeMove(int player, int r, int c)
    {
        if(board[r][c]==0)
        {
            board[r][c]=player;
            return true;
        }
        else
        {
            return false;
        }
    }

    // Returns:     0 = no winner yet
    //              1 = player 1 wins
    //              2 = player 2 wins
    //              3 = Draw (no spaces left, no winner)
    public int checkWinner()
    {
        //USE checkRow, checkCol, and checkDiagonals here!

        for(int r=0; r < board.length; r++)
        {
            for (int c = 0; c < board[1].length; c++)
            {
                if(checkRow(r)==1||(checkCol(c)==1)||(checkDiagonals()==1))
                {
                    return 1;
                }
                else if(checkRow(r)==2||(checkCol(c)==2)||(checkDiagonals()==2))
                {
                    return 2;
                }

            }
        }
        int number=0;
        for(int r=0; r < board.length; r++)
        {
            for (int c = 0; c < board[1].length; c++)
            {
                if(board[r][c]>=1)
                {
                    number++;
                }

            }
        }
        if(number==(board.length*board.length))
        {
            return 3;
        }
        return 0;
    }

    // Returns:     0 = no winner yet
    //              1 = player 1 wins
    //              2 = player 2 wins
    // Input parameter r represents which # row to check
    private int checkRow(int r)
    {
        boolean isSame=true;
        boolean win=false;
        for(int i=0; i<board.length;i++)
        {

            if((board[r][i]!=1))
            {
                isSame=false;
            }

        }
        if(isSame==true)
            return 1;

        boolean isSame2=true;
        for(int i=0; i<board.length;i++)
        {
            if((board[r][i]!=2))
            {
                isSame2=false;
            }
        }
        if(isSame2==true)
            return 2;
        else
            return 0;

    }

    // Returns:     0 = no winner yet
    //              1 = player 1 wins
    //              2 = player 2 wins
    // Input parameter c represents which # col to check
    private int checkCol(int c)
    {
        boolean isSame=true;

        for(int i=0; i<board.length;i++)
        {
            if((board[i][c]!=1))
            {
                isSame=false;
            }
        }
        if(isSame==true)
            return 1;

        boolean isSame2=true;

        for(int i=0; i<board.length;i++)
        {
            if((board[i][c]!=2))
            {
                isSame2=false;
            }
        }
        if(isSame2==true)
            return 2;
        else
            return 0;
    }

    // Returns:     0 = no winner yet
    //              1 = player 1 wins
    //              2 = player 2 wins
    // Will check both diagonals for a winner
    private int checkDiagonals()
    {
        boolean isSame=true;

        for(int i=0; i<board.length;i++)
        {
            if((board[i][i]!=1))
            {
                isSame=false;
            }
        }
        if(isSame==true)
            return 1;

        boolean isSame2=true;

        for(int i=0; i<board.length;i++)
        {
            if((board[i][i]!=2))
            {
                isSame2=false;
            }
        }
        if(isSame2==true)
            return 2;

        isSame=true;
        for(int i=0; i<board.length;i++)
        {
            if((board[i][board.length-i-1]!=1))
            {
                isSame=false;
            }
        }
        if(isSame==true)
            return 1;

        isSame2=true;
        for(int i=0; i<board.length;i++)
        {
            if((board[i][board.length-i-1]!=2))
            {
                isSame2=false;
            }
        }
        if(isSame2==true)
            return 2;

        return 0;
    }

    private int checkRowsAI(int r)
    {
        boolean isSame=true;
        int total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[r][i]==1)
                total++;
            else if(board[r][i]==2)
                isSame=false;
        }
        if(total==board.length-1 && isSame==true)
            return 1;
        else 
            return 0;
    }

    private int checkColsAI(int c)
    {
        boolean isSame=true;
        int total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[i][c]==1)
                total++;
            else if(board[i][c]==2)
                isSame=false;
        }
        if(total==board.length-1 && isSame==true)
            return 1;
        else 
            return 0;
    }

    private int checkDiagAI()
    {
        boolean isSame=true;
        int total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[i][i]==1)
            {
                total++;
            }
            else if(board[i][i]==2)
                isSame=false;
        }
        if(total==board.length-1 && isSame==true)
            return 1;

        isSame=true;
        total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[i][board.length-i-1]==1)
            {
                total++;
            }
            else if(board[i][board.length-i-1]==2)
                isSame=false;
        }
        if(total==board.length-1 && isSame==true)
            return 1;

        return 0;
    }

    public int checkBeforeWinner()
    {
        for(int r=0; r < board.length; r++)
        {
            for (int c = 0; c < board[1].length; c++)
            {
                if(checkRowsAI(r)==1)
                {
                    return 1;
                }
                else if(checkColsAI(c)==1)
                {
                    return 2;
                }
                else if((checkDiagAI()==1))
                {
                    return 3;
                }

            }
        }
        return 0;
    }

    public int checkRowsAI2(int r)
    {
        int total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[r][i]==1)
                total++;
        }
        if(total==board.length-1)
            return r;
        else 
            return -1;
    }

    public int checkColsAI2(int c)
    {
        int total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[i][c]==1)
                total++;
        }
        if(total==board.length-1)
            return c;
        else 
            return -1;
    }

    public int checkDiagAI2()
    {
        int total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[i][i]==1)
            {
                total++;
            }
        }
        if(total==board.length-1)
            return 1;
        total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[i][board.length-i-1]==1)
            {
                total++;
            }
        }
        if(total==board.length-1)
            return 2;

        return 0;
    }

    private int checkRowsPL(int r)
    {
        boolean isSame=true;
        int total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[r][i]==2)
                total++;
            else if(board[r][i]==1)
                isSame=false;
        }
        if(total==board.length-1 && isSame==true)
            return 1;
        else 
            return 0;
    }

    private int checkColsPL(int c)
    {
        boolean isSame=true;
        int total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[i][c]==2)
                total++;
            else if(board[i][c]==1)
                isSame=false;
        }
        if(total==board.length-1 && isSame==true)
            return 1;
        else 
            return 0;
    }

    private int checkDiagPL()
    {
        boolean isSame=true;
        int total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[i][i]==2)
            {
                total++;
            }
            else if(board[i][i]==1)
                isSame=false;
        }
        if(total==board.length-1 && isSame==true)
            return 1;

        isSame=true;
        total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[i][board.length-i-1]==2)
            {
                total++;
            }
            else if(board[i][board.length-i-1]==1)
                isSame=false;
        }
        if(total==board.length-1 && isSame==true)
            return 1;

        return 0;
    }

    public int checkBeforeWinnerAI()
    {
        for(int r=0; r < board.length; r++)
        {
            for (int c = 0; c < board[1].length; c++)
            {
                if(checkRowsPL(r)==1)
                {
                    return 1;
                }
                else if(checkColsPL(c)==1)
                {
                    return 2;
                }
                else if((checkDiagPL()==1))
                {
                    return 3;
                }

            }
        }
        return 0;
    }

    public int checkRowsPL2(int r)
    {
        int total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[r][i]==2)
                total++;
        }
        if(total==board.length-1)
            return r;
        else 
            return -1;
    }

    public int checkColsPL2(int c)
    {
        int total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[i][c]==2)
                total++;
        }
        if(total==board.length-1)
            return c;
        else 
            return -1;
    }

    public int checkDiagPL2()
    {
        int total=0;
        for(int i=0; i<board.length;i++)
        {
            if(board[i][i]==2)
            {
                total++;
            }
        }
        if(total==board.length-1)
            return 1;

        total =0;
        for(int i=0; i<board.length;i++)
        {
            if(board[i][board.length-i-1]==2)
            {
                total++;
            }
        }
        if(total==board.length-1)
            return 2;

        return 0;
    }

}//END CLASS

