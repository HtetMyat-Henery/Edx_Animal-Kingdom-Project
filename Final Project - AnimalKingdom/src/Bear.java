
import java.awt.*;

public class Bear extends Critter{

    private boolean polar;
    private int moves = 0;

    public Bear(boolean polar){
        this.polar = polar;
    }

    public Color getColor(){
        if(polar){
            return Color.WHITE;
        }
        return Color.BLACK;
    }

    public String toString(){
        if(moves % 2 == 0){
            return "/";
        }
        return "\\";
    }

    public Action getMove(CritterInfo info){
        moves++;
        if(info.frontThreat()){
            return Action.INFECT;
        }
        else {
            return Action.LEFT;
        }
    }

}
