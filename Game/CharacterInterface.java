package Game;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Kobran
 */
public class CharacterInterface {

    private JFrame frame = new JFrame();
    private JLabel lblName = new JLabel("Name: ");
    private JLabel lblSTR = new JLabel("Strength: ");
    private JLabel lblDEX = new JLabel("Dexterity: ");
    private JLabel lblCON = new JLabel("Constitution: ");
    private JLabel lblINT = new JLabel("Intelligence: ");
    private JLabel lblWIS = new JLabel("Wisdom: ");
    private JLabel lblCHA = new JLabel("Charisma: ");
    private JLabel lblHealth = new JLabel("Health: ");
    private JLabel lblAC = new JLabel("Armor Class: ");
    private JButton btnOk = new JButton("Ok");
    private JPanel pnlStats = new JPanel(new GridLayout(9, 1));
    private JPanel pnlFrame = new JPanel(new GridLayout(2, 1));

    public CharacterInterface(Character character) {
        int stats[] = character.getStats();
        int health[] = character.getHealth();
        this.lblName.setText(this.lblName.getText() + character.getName());
        this.lblSTR.setText(this.lblSTR.getText() + stats[0]);
        this.lblDEX.setText(this.lblDEX.getText() + stats[1]);
        this.lblCON.setText(this.lblCON.getText() + stats[2]);
        this.lblINT.setText(this.lblINT.getText() + stats[3]);
        this.lblWIS.setText(this.lblWIS.getText() + stats[4]);
        this.lblCHA.setText(this.lblCHA.getText() + stats[5]);
        this.lblHealth.setText(this.lblHealth.getText() + health[0] + "/" + health[1]);
        this.lblAC.setText(this.lblAC.getText() + stats[6]);

        frame.setSize(200, 300);
        frame.setTitle(character.getName());
        frame.setResizable(false);
        pnlStats.setBorder(BorderFactory.createTitledBorder(character.getName()));
        //pnlStats.add(lblName);
        pnlStats.add(lblHealth);
        pnlStats.add(lblAC);
        pnlStats.add(lblSTR);
        pnlStats.add(lblDEX);
        pnlStats.add(lblCON);
        pnlStats.add(lblINT);
        pnlStats.add(lblWIS);
        pnlStats.add(lblCHA);
        frame.add(pnlStats, BorderLayout.CENTER);
        frame.add(btnOk, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
