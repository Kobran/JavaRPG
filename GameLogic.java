package jbuttonattack;

/**
 *
 * @author Kobran
 */
public class GameLogic {
    private UserInterface gui;

    public GameLogic(){
        gui = new UserInterface(this);
    }

    public void setUserInterface(UserInterface gui){
        this.gui = gui;
    }
}
