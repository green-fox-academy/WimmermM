import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plants> plantsList = new ArrayList<>();

    public Garden(List<Plants> plantsList) {
        this.plantsList = plantsList;
    }


    public void plantsList (Plants plant){
        plantsList.add(plant);
    }


    public void watering(){
        for (int i = 0; i < plantsList.size() ; i++) {
            if (plantsList.get(i).needWater){

            }

        }


    }


}
