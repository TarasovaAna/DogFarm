package com.leverx.farm;

import com.leverx.farm.classes.Dog;
import com.leverx.farm.trainingGrouns.TrainingGround;

public class Group {
    private Dog[] groupDogs;
    private TrainingGround trainingGround;
    public Group(Dog... dogs){
        groupDogs = new Dog[dogs.length];
        for (int i = 0; i < groupDogs.length; i++) {
            groupDogs[i] = dogs[i];
        }
    }

    public boolean enterTrainingGround(TrainingGround trainingGround){
        return trainingGround.occupied(this);
    }

    public void runTraining(){
    }

    public Dog[] getGroupDogs() {
        return groupDogs;
    }

    public void setGroupDogs(Dog[] groupDogs) {
        this.groupDogs = groupDogs;
    }

    public void info(){
        for (Dog groupDog : groupDogs){
            groupDog.info();
        }
    }
    public void foodInfo(){
        for (Dog groupDog : groupDogs){
            groupDog.foodInfo();
        }
    }
    public void getSick(){
        for (Dog groupDog : groupDogs){
            groupDog.getSick();
        }
    }
    public void getHealthPoints(){
        for (Dog groupDog : groupDogs){
            groupDog.getHealthPoints();
        }
    }

    public TrainingGround getTrainingGround() {
        return trainingGround;
    }

    public void setTrainingGround(TrainingGround trainingGround) {
        this.trainingGround = trainingGround;
    }

}
