package Game;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 *
 * @author Kobran
 */
public class UserInterface implements ActionListener {

    private GameLogic logic;
    private JFrame frame = new JFrame("JavaRPG");
    private JLabel lbl = new JLabel("Game");
    private JPanel pnlCharacters = new JPanel(new BorderLayout());
    private JPanel pnlCharacterInfo = new JPanel(new GridLayout(8, 1));
    private JButton btnSelectCharacter = new JButton("Select");
    private JButton btnTemp = new JButton("Temporary");
    private JPanel pnlCharButtons = new JPanel(new GridLayout(1, 2));
    private JLabel[] lblDescription = new JLabel[8];
    private JLabel lblTodo2 = new JLabel("Todo");
    private JPanel pnlNorth = new JPanel(new GridLayout(1, 3));
    private JPanel pnlActions = new JPanel(new GridLayout(2, 2));
    private JList listChar;
    private JPanel pnlSouth = new JPanel(new GridLayout(1, 3));
    private JTextArea txtStuff = new JTextArea("Yo lowl \n dawg\nlets\nfill\nthis\nshit\nup\nlol");
    private Character[] chars;
    private String[] statsExplanation = {"Strength", "Dexterity", "Constitution", "Intelligence", "Wisdom", "Charisma", "Armor Class"};

    public UserInterface(Character[] chars) {
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.chars = chars;
        listChar = new JList(this.chars);
        pnlCharacters.setBorder(BorderFactory.createTitledBorder("Characters"));
        pnlCharacters.add(listChar, BorderLayout.CENTER);
        pnlCharButtons.add(btnSelectCharacter);
        pnlCharButtons.add(btnTemp);
        pnlCharacters.add(pnlCharButtons, BorderLayout.SOUTH);
        pnlCharacterInfo.setBorder(BorderFactory.createTitledBorder("Information"));
        for (int i = 0; i < 8; i++) {
            lblDescription[i] = new JLabel("");
            pnlCharacterInfo.add(lblDescription[i]);
        }
        pnlActions.setBorder(BorderFactory.createTitledBorder("Actions"));
        pnlActions.add(lblTodo2);
        pnlNorth.add(pnlCharacters);
        pnlNorth.add(pnlCharacterInfo);
        pnlNorth.add(pnlActions);
        pnlSouth.add(lbl);
        pnlSouth.add(txtStuff);
        frame.add(pnlNorth, BorderLayout.CENTER);
        frame.add(pnlSouth, BorderLayout.SOUTH);
        frame.setVisible(true);
        btnSelectCharacter.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSelectCharacter) {
            String description;
            int[] stats;
            String name;
            int selection = listChar.getLeadSelectionIndex();
            stats = chars[selection].getStats();
            name = chars[selection].getName();
            lblDescription[0].setText("Name: " + name);
            for (int i = 0; i < stats.length; i++) {
                lblDescription[i + 1].setText(this.statsExplanation[i] + ": " + stats[i]);
            }
        }
    }
}
