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
    private JPanel pnlCharacters = new JPanel(new GridLayout(20, 1));
    private JPanel pnlCharacterInfo = new JPanel(new GridLayout(10, 1));
    private JLabel lblTodo = new JLabel("Todo");
    private JPanel pnlNorth = new JPanel(new GridLayout(1, 3));
    private JPanel pnlActions = new JPanel(new GridLayout(2, 2));
    private JLabel[] lblChar = new JLabel[10];

    public UserInterface() {
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < lblChar.length; i++) {
            lblChar[i] = new JLabel("");
            pnlCharacters.add(lblChar[i]);
        }
        pnlCharacters.setBorder(BorderFactory.createTitledBorder("Characters"));
        pnlCharacterInfo.setBorder(BorderFactory.createTitledBorder("Information"));
        pnlCharacterInfo.add(lblTodo);
        pnlActions.setBorder(BorderFactory.createTitledBorder("Actions"));
        pnlActions.add(lblTodo);
        pnlNorth.add(pnlCharacters);
        pnlNorth.add(pnlCharacterInfo);
        pnlNorth.add(pnlActions);
        frame.add(pnlNorth);
        frame.setVisible(true);
    }

    public void setCharacter(int index, Character cha) {
        lblChar[index].setText(cha.getName());
    }
}
