package ChessPractice;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements ChessPiece
{
	// Write your code here
	
    private int[][] positions = new int[8][2];

    public Pawn()
    {
        setPosition();
    }

    @Override
    public void setPosition()
    {
        for (int i = 0; i < 8; i++)
        {
            positions[i][0] = 6; // Row 6
            positions[i][1] = i; // Columns 0 to 7
        }
    }

    @Override
    public List<int[]> getPossibleMoves(int currentX, int currentY)
    {
        List<int[]> moves = new ArrayList<>();
        
        if (currentX > 0)
        	moves.add(new int[]{currentX - 1, currentY});
        
        return moves;
    }

    @Override
    public boolean checkMovable(int targetX, int targetY)
    {
        if (targetX < 0 || targetX >= 8 || targetY < 0 || targetY >= 8)
        	return false;
        
        return " ".equals(ChessBoardUI.board[targetX][targetY]);
    }

    @Override
    public void move(int currentX, int currentY, int targetX, int targetY)
    {
        if (checkMovable(targetX, targetY))
        {
            ChessBoardUI.board[targetX][targetY] = "P";
            ChessBoardUI.board[currentX][currentY] = " ";
        }
    }
}