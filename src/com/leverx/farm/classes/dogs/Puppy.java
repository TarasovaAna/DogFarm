package com.leverx.farm.classes.dogs;

import com.leverx.farm.classes.Dog;
import com.leverx.farm.classes.FoodType;
import com.leverx.farm.classes.TrainType;

public class Puppy extends Dog {
    public Puppy(String name) {
        this.setAge(1);
        this.setMaxHungerLevel(10);
        this.setMaxHealthPoints(10);
        this.setHealthPoints(10);
        this.setName(name);
        this.setHungerLevel(2);
        this.setTrainType(TrainType.GUARD);
        this.setFoodType(FoodType.FOR_PUPPIES);
    }
}
