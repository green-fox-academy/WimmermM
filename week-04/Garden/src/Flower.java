import java.util.ArrayList;
import java.util.List;

public class Flower extends Plants {
    int waterAbsorb;


    public Flower(int waterLevel, String color, boolean needWater, String type, int waterAbsorb) {
        super(waterLevel, color, needWater, type);
        this.waterAbsorb = waterAbsorb*3/4;
    }


    public boolean flowerWaterLevel(){

        if (waterLevel< 5){
            System.out.println("The " + color  + " needs water");
            return needWater = true;
        }
        else {
            System.out.println("The " + color  + " doesnt need water");
            return needWater = false;
        }

    }




}
