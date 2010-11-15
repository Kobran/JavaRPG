package Game;

/**
 *
 * @author Kobran
 */
public class Character {

    private byte STR;
    private byte DEX;
    private byte CHA;
    private byte CON;
    private byte INT;
    private byte WIS;
    //Funderar på att lagra attribut i en array istället
    //private byte[] attributes = { str, dex etc };
    private String name;
    private int maxHealthPoints;
    private int healthPoints;
    private int armorClass;
    private int healthBonus;
    private float capacity;
    private Inventory inventory;

    public Character(String name) {
        this.name = name;
        this.STR = 6;
        this.DEX = 6;
        this.CHA = 6;
        this.CON = 6;
        this.INT = 6;
        this.WIS = 6;
        this.healthBonus = 0;
        this.capacity = 20;
        this.armorClass = 10 + (this.DEX / 4) + (this.WIS / 5);
        this.maxHealthPoints = 15 + ((this.CON / 3) * 2 + (this.STR / 4));
        this.healthPoints = maxHealthPoints;
        this.inventory = new Inventory(this);
    }

    public Character(byte str, byte dex, byte cha, byte con, byte INT, byte wis, String name) {
        this.name = name;
        this.STR = str;
        this.DEX = dex;
        this.CHA = cha;
        this.CON = con;
        this.INT = INT;
        this.WIS = wis;
        this.healthBonus = 0;
        this.armorClass = 10 + (this.DEX / 4) + (this.WIS / 5);
        this.maxHealthPoints = 15 + ((this.CON / 3) * 2 + (this.STR / 4));
        this.healthPoints = maxHealthPoints;
    }

    public int[] getStats() {
        int[] stats = {this.STR, this.DEX, this.CON, this.INT, this.WIS, this.CHA, this.armorClass};
        return stats;
    }

    public float getCapacity() {
        return this.capacity;
    }

    public int[] getHealth() {
        int[] health = {this.healthPoints, this.maxHealthPoints};
        return health;
    }

    public String getName() {
        return this.name;
    }

    private void calibrate() {
        this.armorClass = 10 + (this.DEX / 4) + (this.WIS / 5);
        this.maxHealthPoints = 15 + ((this.CON / 3) * 2 + (this.STR / 4)) + this.healthBonus;
    }

    public void printStats() {
        System.out.println(this.name);
        System.out.println(this.healthPoints + "/" + this.maxHealthPoints + " HP");
        System.out.println("Armor class: " + this.armorClass);
        System.out.println("Strength: " + this.STR);
        System.out.println("Dexterity: " + this.DEX);
        System.out.println("Constitution: " + this.CON);
        System.out.println("Intelligence: " + this.INT);
        System.out.println("Charisma: " + this.CHA);
        System.out.println("Wisdom: " + this.WIS);

    }
}
