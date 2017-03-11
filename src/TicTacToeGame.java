import java.awt.event.MouseEvent;

/**
 * @author Daniel Ackerman 23104834
 * @version 0.1.0, 3/10/2017
 */
public class TicTacToeGame extends Game {

    TicTacToeGame() {
        super(new TicTacToeFactory());
    }


    @Override
    protected void run() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Tile clicked = (Tile)e.getComponent();
        clicked.addPiece(pieces.get(0));
        System.out.println("Selected row: " + clicked.getRow() + ", column: " + clicked.getColumn() + ".");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
