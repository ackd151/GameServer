import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Created by ACKD151 on 3/9/2017.
 */
public class Tile extends JPanel {
    Player owned = null; // ??? Need to maintain Tile ownership; PlayerX or null...
    int row, column;

    public Tile(int row, int column)   {
        super(new GridLayout(1,1));
        this.row = row;
        this.column = column;
    }

    public void addPiece(ImageIcon gamePiece)   {
        JLabel imageHolder = new JLabel(gamePiece);
        add(imageHolder);
        imageHolder.setVisible(true);
        imageHolder.repaint();
    }

    public int getRow() {
        return row;
    }

    public int getColumn()  {
        return column;
    }

}
