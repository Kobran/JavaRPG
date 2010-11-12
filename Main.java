
/**
 *
 * @author Kobran
 */
public class Main {

    public static void main(String[] args) {
        //GameLogic logic = new GameLogic();

        Character jocke = new Character((byte) 8, (byte) 15, (byte) 12, (byte) 14, (byte) 9, (byte) 14, "Jocke");
        Character lol = new Character((byte) 10, (byte) 25, (byte) 19, (byte) 21, (byte) 3, (byte) 6, "Lolface");
        //jocke.printStats();
        new CharacterInterface(jocke);
        new CharacterInterface(lol);
    }
}
