package Game;

/**
 *
 * @author Kobran
 */
public class Ability {

    private String  name;
    private String  description;
    
    private int     usedAttribute;      //This ability utilizes which attribute?
    private Character target;           //Whether the ability targets friend or foe
    private int     drainAmount;        //How much is drained from the user
    private int     drainType;          //What kind is drained (HP, mana, maybe AC?)
    private int     affectedAttribute;  //Which target attribute is manipulated?
    private int     affectedAmount;     //well, duh.
    private Ability prerequisite;       //Requires another ability to be taught?
    private boolean passive;            //Whether this ability is activated once
                                        //(like a strike) or if it's a channeled
                                        //ability (like a status changing spell)
    private Item itemRequirement;       //Does this ability require a specific
                                        //item?
}
