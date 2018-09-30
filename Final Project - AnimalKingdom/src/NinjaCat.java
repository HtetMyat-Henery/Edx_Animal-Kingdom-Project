import java.awt.*;
import java.util.ArrayList;

public class NinjaCat extends Critter{

    public NinjaCat() {}
    private boolean infected = false;

    public Color getColor(){
        ArrayList<Color> catColor = new ArrayList<>();
        catColor.add(Color.WHITE);
        catColor.add(Color.YELLOW);
        catColor.add(Color.BLACK);
        catColor.add(Color.GRAY);

        return catColor.get((int)Math.floor(Math.random()*3));
    }

    public String toString(){
        if(!infected) {
            return "(OwO)";
        }
        else{
            return "Rarrr";
        }
    }

    public Action getMove(CritterInfo info){
        if(info.frontThreat()){
            infected = true;
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
