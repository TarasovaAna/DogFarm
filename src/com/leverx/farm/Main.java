package com.leverx.farm;

import com.leverx.farm.aviaries.Aviary;
import com.leverx.farm.classes.Dog;
import com.leverx.farm.classes.dogs.Elderly;
import com.leverx.farm.classes.dogs.Mature;
import com.leverx.farm.classes.dogs.Puppy;
import com.leverx.farm.trainingGrouns.TrainingGround;


public class Main {

    public static void main(String[] args) {
        Group group = new Group(new Puppy("Nicky"), new Mature("Kimmy"), new Elderly("Ben"));
        group.info();
        System.out.println("Feeding");
        group.foodInfo();
        System.out.println("Examination");
        group.getSick();
        group.getHealthPoints();
        System.out.println("Cleaning aviaries");
        Aviary aviary = new Aviary(true);
        aviary.cleaned();
        TrainingGround trainingGround = new TrainingGround();
        if (group.enterTrainingGround(trainingGround)){
            group.setTrainingGround(trainingGround);
            group.runTraining();
        }else {
            System.out.println("training is completed");
        }
        System.out.println("Working dogs");
        Mature mature = new Mature(true);
        mature.work();
        System.out.println("evening feeding");
        group.foodInfo();
    }

}
