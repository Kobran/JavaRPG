package Game;

/**
 *
 * @author Kobran
 */
public class GameLogic {

    private UserInterface gui;

    public GameLogic() {
        Character jocke = new Character((byte) 8, (byte) 15, (byte) 12, (byte) 14, (byte) 9, (byte) 14, "Jocke");
        Character lol = new Character((byte) 10, (byte) 25, (byte) 19, (byte) 21, (byte) 3, (byte) 6, "Lolface");

        new CharacterInterface(jocke);
        new CharacterInterface(lol);

        gui = new UserInterface();
        gui.setCharacter(0, jocke);
        gui.setCharacter(1, lol);
    }

    public void setUserInterface(UserInterface gui) {
        this.gui = gui;
    }
}
