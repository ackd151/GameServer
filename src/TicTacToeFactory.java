import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TicTacToeFactory implements AbstractGameFactory{

    @Override
    public GameBoard createGameBoard() {
        GameBoard tttBoard = new GameBoard(450, 450, 3, 3,
                new Color(203,184,128), new Color(182,155,76), "Tic Tac Toe");
        tttBoard.addTicTacToeBorders();
        return tttBoard;
    }

    @Override
    public ArrayList<ImageIcon> loadImages() {
        return null;
    }

    @Override
    public void setUpBoard(GameBoard board, ArrayList<ImageIcon> pieces) {

    }

}
