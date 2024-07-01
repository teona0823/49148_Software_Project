package ChessGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ChessBoardUI extends JFrame
{
	public static JButton[][] squares = new JButton[8][8];
	public static String[][] board = new String[8][8];

	public ChessBoardUI()
	{
		setTitle("Chess Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 8));
        setSize(600, 600);
        setVisible(true);
	}
	
	public void initializeBoard()
	{
		// Initialize the board with empty spaces (" ")
		for (int i = 0; i < 8; i++)
		{
            for (int j = 0; j < 8; j++)
            	board[i][j] = " ";
        }

        // Place pawns on the board
        for (int i = 0; i < 8; i++)
        {
            board[6][i] = "P";  // Pawns
        }

        // Place other pieces on the board
        // Black pieces
        board[7][0] = "R";
        board[7][1] = "K";
        board[7][2] = "B";
        board[7][3] = "Q";
        board[7][4] = "King";
        board[7][5] = "B";
        board[7][6] = "K";
        board[7][7] = "R";
	}
	
	public void createUI()
	{
		for (int i = 0; i < 8; i++)
		{
	        for (int j = 0; j < 8; j++)
	        {
	            squares[i][j] = new JButton(board[i][j]);
	            squares[i][j].setBackground((i + j) % 2 == 0 ? Color.WHITE : Color.GRAY);
	            squares[i][j].setOpaque(true);
	            squares[i][j].setBorderPainted(false);
	            squares[i][j].addActionListener(new ButtonListener(i, j));
	            add(squares[i][j]);
	        }
		}
	}
	
	public static void updateUI()
	{
		for (int i = 0; i < 8; i++)
		{
            for (int j = 0; j < 8; j++)
            	squares[i][j].setText(board[i][j]);
        }
	}
}
