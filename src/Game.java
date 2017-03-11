import javax.swing.*;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * Created by ACKD151 on 3/10/2017.
 */
public abstract class Game extends JFrame implements MouseListener  {
    protected AbstractGameFactory agf;
    protected GameBoard board;
    protected ArrayList<ImageIcon> pieces;
    protected Player isTurn;
    protected ArrayList<Player> players;

    protected Game(AbstractGameFactory factory) {
        agf = factory;
        board = agf.createGameBoard();
        pieces = agf.loadImages();
        agf.setUpBoard(board, pieces);
        validate();
        repaint();
//        board.tileTrial();
    }

    protected abstract void run();
}
