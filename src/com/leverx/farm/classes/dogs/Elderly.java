package com.leverx.farm.classes.dogs;

import com.leverx.farm.classes.Dog;
import com.leverx.farm.classes.FoodType;
import com.leverx.farm.classes.TrainType;

public class Elderly extends Dog {
    public Elderly(String name) {
        this.setAge(9);
        this.setMaxHealthPoints(10);
        this.setMaxHungerLevel(10);
        this.setHealthPoints(7);
        this.setName(name);
        this.setHungerLevel(3);
        this.setTrainType(TrainType.RETIRED);
        this.setFoodType(FoodType.FOR_RETIRED);
    }
}
