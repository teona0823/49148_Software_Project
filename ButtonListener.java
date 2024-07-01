package ChessGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ChessGame.ChessBoardUI.board;

public class ButtonListener implements ActionListener
{
	// x and y indicate the location of the piece
    private final int x;
    private final int y;

    public ButtonListener(int x, int y)
    {
    	this.x = x;
    	this.y = y;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
    	// Implement the logic to move a piece (only pawn “P”)
        if (board[x][y].equals("P"))
        {
            if (x > 0 && board[x - 1][y].equals(" "))
            {
                board[x - 1][y] = "P";
                board[x][y] = " ";
                ChessBoardUI.updateUI();
            }
        }
    }
}
