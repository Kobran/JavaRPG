package Game;

import javax.swing.UIManager;

/**
 *
 * @author Kobran
 */
public class GameLogic {

    private UserInterface gui;

    public GameLogic() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }
        Character jocke = new Character((byte) 8, (byte) 15, (byte) 12, (byte) 14, (byte) 9, (byte) 14, "Jocke");
        Character lol = new Character((byte) 10, (byte) 25, (byte) 19, (byte) 21, (byte) 3, (byte) 6, "Lolface");
        Character lol1 = new Character((byte) 10, (byte) 25, (byte) 19, (byte) 21, (byte) 3, (byte) 6, "Awesomeface");
        Character lol2 = new Character((byte) 10, (byte) 25, (byte) 19, (byte) 21, (byte) 3, (byte) 6, "Doucheface");
        Character lol3 = new Character((byte) 10, (byte) 25, (byte) 19, (byte) 21, (byte) 3, (byte) 6, "Bob");

        Character[] chars = {jocke, lol, lol1, lol2, lol3};
        gui = new UserInterface(chars);
    }

    public void setUserInterface(UserInterface gui) {
        this.gui = gui;
    }
}
