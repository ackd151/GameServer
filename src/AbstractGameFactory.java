import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by ACKD151 on 3/10/2017.
 */
public interface AbstractGameFactory {
    GameBoard createGameBoard();
    ArrayList<ImageIcon> loadImages();
    void setUpBoard(GameBoard board, ArrayList<ImageIcon> pieces);
}
