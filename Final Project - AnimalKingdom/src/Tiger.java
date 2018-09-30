import java.awt.*;
import java.util.ArrayList;

public class Tiger extends Critter{

    int moves = 0;

    public Tiger(){ }

    public Color getColor(){
        ArrayList<Color> color = new ArrayList<>();
        color.add(Color.RED);
        color.add(Color.GREEN);
        color.add(Color.BLUE);
        return color.get((int) Math.floor((Math.random()*2)));
    }

    public String toString(){

        return "TGR";

    }

    public Action getMove(CritterInfo info){
        if(info.frontThreat()){
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
