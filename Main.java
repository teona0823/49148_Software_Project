package ChessGame;

public class Main
{
    public static void main(String[] args)
    {
        ChessBoardUI chessBoardUI = new ChessBoardUI();

        chessBoardUI.initializeBoard();
        chessBoardUI.createUI();
        ChessBoardUI.updateUI();
    }
}
