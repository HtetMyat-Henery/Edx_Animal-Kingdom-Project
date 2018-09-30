import java.awt.*;

public class Giant extends Critter {

    public Giant() {}
    private int movesCount = 1;

    public Color getColor(){
        return Color.GRAY;
    }

    public String toString(){
        if(movesCount <= 6){
            return "fee";
        }
        else if(movesCount <= 12){
            if(movesCount == 12){
                movesCount = 0;
            }
            return "foe";
        }
        return "";
    }

    public Action getMove(CritterInfo info){
        if(info.frontThreat()){
            return Action.INFECT;
        }
        else if(Action.HOP.equals(Neighbor.EMPTY)){
            return Action.HOP;
        }
        else {
            return Action.RIGHT;
        }
    }

}
