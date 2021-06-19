package tictactoegame;

public class TicTacToeGame {
    public static  char[] board = new char[10];//creating
    public static void creatingBoard()//creating Board
    {
        for(int i=1;i<10;i++){
            board[i]--;
        }
        System.out.println(board);

    }
    public static void main(String[] args) //main method
    {
        creatingBoard();
    }

}
