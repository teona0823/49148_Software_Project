package ChessPractice;

public class ChessBoardUI
{
	public static String[][] board = new String[8][8];

    public ChessBoardUI()
    {
    	initializeBoard();
    }

    private void initializeBoard()
    {
        // Write your code here
        // hint: 1.	A chess board is a board of fixed size, 8x8, where each square initially contains an whitespace (" ").
    	
    	for (int i = 0; i < 8; i++)
    	{
    		for (int j = 0; j < 8; j++)
    			board[i][j] = " ";
    	}
    	
    	for (int i = 0; i < 8; i++)
    		board[6][i] = "P";
    	
    	board[7][0] = "R";
    	board[7][1] = "K";
    	board[7][2] = "B";
    	board[7][3] = "Q";
    	board[7][4] = "K";
    	board[7][5] = "B";
    	board[7][6] = "K";
    	board[7][7] = "R";

        System.out.println("Board initialized");
    }

    public void putPiece(ChessPiece piece)
    {
    	piece.setPosition();
    }
}
