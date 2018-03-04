import cs1.*;
public class GameRunnerAIandPlayerTwo
{
    public static void main(String[] args)
    {
        System.out.print("Choose your board size(3, 5, 7, or 9): ");
        int size =Keyboard.readInt();
        while(size<3||size>9||size==4||size==6||size==8)
        {
            System.out.print("3, 6, or 9 PLEASE!");
            size =Keyboard.readInt();
        }
        int[][] board = new int[size][size];
        System.out.print("\fPlayer Vs. Player or Player Vs. AI? \n (PvP-1 PvAI-2): ");
        int choice=Keyboard.readInt();
        while(!(choice==1||choice==2))
        {
            System.out.print("1 or 2 PLEASE!");
            choice =Keyboard.readInt();
        }
        boolean Ai=false;
        if(choice==1)
            Ai=false;
        else
            Ai=true;

        TicTacToe ttt = new TicTacToe(board);
        boolean good;
        boolean rowGuess;
        boolean colGuess;
        int row;
        int col;
        while(ttt.checkWinner()==0)
        {
            ttt.printBoard(board);
            good=true;
            if(Ai==false)
                System.out.println("Player one: ");
            else
                System.out.println("Your move: ");
            while(good)
            {
                System.out.print("r: ");
                row = Keyboard.readInt();
                rowGuess = false;
                while(rowGuess==false)
                {
                    if (row<0||row>board.length-1)
                    {
                        System.out.println("Invalid Guess: please try again");
                        System.out.print("r: ");
                        row=Keyboard.readInt();
                    }
                    else
                    {
                        rowGuess=true;
                    }
                }
                System.out.print("c: ");
                col = Keyboard.readInt();
                colGuess = false;
                while(colGuess==false)
                {
                    if (col<0||col>board.length-1)
                    {
                        System.out.println("Invalid Guess: please try again");
                        System.out.print("c: ");
                        col=Keyboard.readInt();
                    }
                    else
                    {
                        colGuess=true;
                    }
                }
                if(ttt.makeMove(1,row,col))
                {
                    ttt.printBoard(board);
                    ttt.checkWinner();
                    good=false;
                }
                else
                    System.out.println("Try again:");
                ttt.checkWinner();
            }
            if(ttt.checkWinner()==0)
            {
                if(Ai==true)
                {
                    if(ttt.checkBeforeWinnerAI()>0)
                    {
                        //System.out.print(ttt.checkBeforeWinnerAI()+5);
                        //int r2442=Keyboard.readInt();
                        if(ttt.checkBeforeWinnerAI()==1)
                        {
                            for(int r=0; r < board.length; r++)
                            {
                                if(ttt.checkRowsPL2(r)>=0)
                                {
                                    for(int c=0; c < board.length; c++)
                                    {
                                        if(ttt.makeMove(2,r,c))
                                        {
                                            r=board.length;
                                            c=board.length;
                                            ttt.printBoard(board);
                                            ttt.checkWinner();
                                        }
                                    }
                                }
                            }
                        }
                        else if(ttt.checkBeforeWinnerAI()==2)
                        {
                            for(int c=0; c < board.length; c++)
                            {
                                if(ttt.checkColsPL2(c)>=0)
                                {
                                    for(int r=0; r < board.length; r++)
                                    {
                                        if(ttt.makeMove(2,r,c))
                                        {
                                            r=board.length;
                                            c=board.length;
                                            ttt.printBoard(board);
                                            ttt.checkWinner();
                                        }
                                    }
                                }
                            }
                        }
                        else if(ttt.checkBeforeWinnerAI()==3)
                        {
                            if(ttt.checkDiagPL2()==1)
                            {
                                for(int r=0; r < board.length; r++)
                                {
                                    if(ttt.makeMove(2,r,r))
                                    {
                                        r=board.length;
                                        ttt.printBoard(board);
                                        ttt.checkWinner();
                                    }
                                }
                            }
                            else if(ttt.checkDiagPL2()==2)
                            {
                                for(int i=0; i < board.length; i++)
                                {
                                    if(ttt.makeMove(2, i, board.length-i-1))
                                    {
                                        i=board.length;
                                        ttt.printBoard(board);
                                        ttt.checkWinner();

                                    }
                                }
                            }
                        }
                    }
                    else if(ttt.checkBeforeWinner()>0)
                    {
                        //System.out.print(ttt.checkBeforeWinner());
                        //int r2442=Keyboard.readInt();
                        if(ttt.checkBeforeWinner()==1)
                        {
                            for(int r=0; r < board.length; r++)
                            {
                                if(ttt.checkRowsAI2(r)>=0)
                                {
                                    for(int c=0; c < board.length; c++)
                                    {
                                        if(ttt.makeMove(2,r,c))
                                        {
                                            r=board.length;
                                            c=board.length;
                                            ttt.printBoard(board);
                                            ttt.checkWinner();
                                        }
                                    }
                                }
                            }
                        }
                        else if(ttt.checkBeforeWinner()==2)
                        {
                            for(int c=0; c < board.length; c++)
                            {
                                if(ttt.checkColsAI2(c)>=0)
                                {
                                    for(int r=0; r < board.length; r++)
                                    {
                                        if(ttt.makeMove(2,r,c))
                                        {
                                            r=board.length;
                                            c=board.length;
                                            ttt.printBoard(board);
                                            ttt.checkWinner();
                                        }
                                    }
                                }
                            }
                        }
                        else if(ttt.checkBeforeWinner()==3)
                        {
                            if(ttt.checkDiagAI2()==1)
                            {
                                for(int r=0; r < board.length; r++)
                                {
                                    if(ttt.makeMove(2,r,r))
                                    {
                                        r=board.length;
                                        ttt.printBoard(board);
                                        ttt.checkWinner();
                                    }
                                }
                            }
                            else if(ttt.checkDiagAI2()==2)
                            {
                                for(int i=0; i < board.length; i++)
                                {
                                    if(ttt.makeMove(2, i, board.length-i-1))
                                    {
                                        i=board.length;
                                        ttt.printBoard(board);
                                        ttt.checkWinner();

                                    }
                                }
                            }
                        }
                    }

                    else
                    {
                        row = (int)(Math.random()*(size));
                        col = (int)(Math.random()*(size));
                        rowGuess = false;
                        while(rowGuess==false)
                        {
                            if (ttt.makeMove(2,row,col))
                            {
                                rowGuess=true;
                            }
                            else
                            {
                                row = (int)(Math.random()*size);
                                col = (int)(Math.random()*size);
                            }
                        }
                        ttt.printBoard(board);
                        ttt.checkWinner();
                    }
                }
                else
                {
                    good=true;
                    System.out.println("Player two:");
                    while(good)
                    {
                        System.out.print("r: ");
                        row = Keyboard.readInt();
                        rowGuess = false;
                        while(rowGuess==false)
                        {
                            if (row<0||row>board.length-1)
                            {
                                System.out.println("Invalid Guess: please try again");
                                System.out.print("r: ");
                                row=Keyboard.readInt();
                            }
                            else
                            {
                                rowGuess=true;
                            }
                        }
                        System.out.print("c: ");
                        col = Keyboard.readInt();
                        colGuess = false;
                        while(colGuess==false)
                        {
                            if (col<0||col>board.length-1)
                            {
                                System.out.println("Invalid Guess: please try again");
                                System.out.print("c: ");
                                col=Keyboard.readInt();
                            }
                            else
                            {
                                colGuess=true;
                            }
                        }
                        if(ttt.makeMove(2,row,col))
                        {
                            ttt.printBoard(board);
                            ttt.checkWinner();
                            good=false;
                        }
                        else
                            System.out.println("Try again:");
                    }
                }
            }
        }

        if(ttt.checkWinner()==1)
        {
            if(Ai==true)
                System.out.print("You Win! ");
            else
                System.out.print("Player One Wins!");
        }
        else if(ttt.checkWinner()==2)
        {
            if(Ai==true)
                System.out.print("HAHAHA I Win!! I'm too smart for ya");
            else
                System.out.print("Player Two Wins!!!");
        }
        else if(ttt.checkWinner()==3)
        {
            System.out.print("Tie Game!!!");;
        }

        
    }//END MAIN

}//END CLASS
