package Game;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Kobran
 */
public class UserInterface {
    private GameLogic logic;
    private JFrame frame = new JFrame();
    private JLabel lbl = new JLabel("Game");

    public UserInterface(GameLogic logic){
        this.logic = logic;
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(lbl);
        frame.setVisible(true);
    }
}
