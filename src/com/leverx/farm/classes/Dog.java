package com.leverx.farm.classes;

public abstract class Dog implements Base{
    private String name;
    private int age;
    private TrainType trainType;
    private FoodType foodType;
    private int healthPoints;
    private int maxHealthPoints;
    private int hungerLevel;
    private int maxHungerLevel;

    @Override
    public void getHungry(int amount) {
        setHungerLevel(this.hungerLevel - amount);
    }

    @Override
    public void getFed(int amount) {
        setHungerLevel(this.hungerLevel + amount);
    }

    @Override
    public void getTrained() {

    }

    @Override
    public void getSick(){
        System.out.println("Name: " + this.name + "\nHealth level: " + this.healthPoints );
    }

    @Override
    public void info() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nTrained as: " + this.trainType + "\nHunger level: " + this.hungerLevel);
    }

    @Override
    public void foodInfo() {
        System.out.println("food type for " + this.name + ": " + this.foodType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthPoints() {
        if (healthPoints<8){
            System.out.println("doggy needs to be examined by Vet");
        }else {
            System.out.println("doggy is healthy");
        }
        return healthPoints;
    }
// health points can't be negative and > than max
    public void setHealthPoints(int healthPoints) {
        if (healthPoints<0){
            this.healthPoints = 0;
        } else if (healthPoints>maxHealthPoints) {
            this.healthPoints = this.maxHealthPoints;
        } else {
            this.healthPoints = healthPoints;
        }
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        if (hungerLevel<0){
            this.hungerLevel = 0;
        } else if (hungerLevel>this.maxHungerLevel){
            this.hungerLevel = this.maxHungerLevel;
        } else {
            this.hungerLevel = hungerLevel;
        }
    }

    public int getMaxHungerLevel() {
        return maxHungerLevel;
    }

    public void setMaxHungerLevel(int maxHungerLevel) {
        this.maxHungerLevel = maxHungerLevel;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
            this.foodType = foodType;
    }
}
