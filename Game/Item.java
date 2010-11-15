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
    private String identifier;

    public Item(String name, String description, float weight, int[] attributeRequirements) {
        this.name = name;
        this.description = description;
        this.attributeRequirements = attributeRequirements;
        this.weight = weight;
        this.identifier = (name+description);
    }

    public String getName() {
        return this.name;
    }

    public float getWeight() {
        return weight;
    }

    public String getDescription() {
        return this.description;
    }
}
