import java.awt.*;

public class WhiteTiger extends Critter{

    public WhiteTiger(){}
    private boolean infectedOther = false;

    public Color getColor(){
        return Color.WHITE;
    }

    public String toString(){
        if(infectedOther){
            return "tgr";
        }
        else {
            return "TGR";
        }
    }

    public Action getMove(CritterInfo info){
        if(info.frontThreat()){
            infectedOther = true;
            return Action.INFECT;
        }
        else if((info.getFront().equals(Neighbor.WALL)) || info.getRight().equals(Neighbor.WALL)){
            return Action.LEFT;
        }
        else if(info.getFront().equals(Neighbor.SAME)){
            return Action.RIGHT;
        }
        else {
            return Action.HOP;
        }
    }

}
