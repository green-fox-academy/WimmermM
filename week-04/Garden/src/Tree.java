public class Tree extends Plants {





    public boolean treeWaterLevel(){

        if (waterLevel< 10){
            System.out.println("The " + color + " needs water");
            return true;
        }
        else {
            System.out.println("The " + color + " doesnt need water");
            return false;
        }

    }




}
