package Game;

/**
 *
 * @author Kobran
 */
public class Item {

    private String name;
    private String description;
    private float weight;
    private int[] attributeRequirements;

    public Item(int id) {

    }
    
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public float getWeight() {
        return weight;
    }
}