package com.leverx.farm.classes.dogs;

import com.leverx.farm.classes.Dog;
import com.leverx.farm.classes.FoodType;
import com.leverx.farm.classes.TrainType;

public class Mature extends Dog {
    private boolean isWorking;

    public Mature(String name) {
        this.setAge(4);
        this.setMaxHealthPoints(10);
        this.setMaxHungerLevel(10);
        this.setHealthPoints(8);
        this.setName(name);
        this.setHungerLevel(4);
        this.setTrainType(TrainType.POLICE);
        this.setFoodType(FoodType.FOR_MATURES);
    }

    public Mature(boolean isWorking) {
        this.isWorking = isWorking;
    }
    public void work(){
        if (isWorking){
            System.out.println("grownUps at work");
        } else {
            System.out.println("work is waiting");
        }
    }
}
