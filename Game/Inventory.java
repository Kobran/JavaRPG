/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;

/**
 *
 * @author Jocke
 */
public class Inventory {
    private float weight;
    private Character master;
    private Item[] slots;
    private int[] slot_stacks;

    public Inventory(Character master) {
        this.slots = new Item[20];
        this.slot_stacks = new int[20];
        this.master = master;
    }

    public void addItem(Item item, int slot) {
        if (this.weight + item.getWeight() <= this.master.getCapacity()) {
            if (this.slots[slot].getName().equals(item.getName())) {
                this.slot_stacks[slot]++;
            } else {
                this.slots[slot] = item;
                this.slot_stacks[slot] = 1;
            }
        }
    }
}
