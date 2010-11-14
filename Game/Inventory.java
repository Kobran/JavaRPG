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
    private Character master;
    private int[][] slots;

    public Inventory(Character master) {
        this.slots = new int[20][2];
        this.master = master;
    }
}
