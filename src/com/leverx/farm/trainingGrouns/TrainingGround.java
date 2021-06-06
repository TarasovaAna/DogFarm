package com.leverx.farm.trainingGrouns;

import com.leverx.farm.Group;

public class TrainingGround implements BasicGround{
    private boolean isOccupied;


    @Override
    public boolean occupied(Group group) {
        if (group.getGroupDogs().length > 5){
            System.out.println("you tried to enter the training ground. Ground is occupied!");
            isOccupied = true;
        }else {
            System.out.println("Ground is unoccupied, you can start training.");
            isOccupied = false;
        }
        return isOccupied;
    }
}
