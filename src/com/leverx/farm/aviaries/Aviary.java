package com.leverx.farm.aviaries;


public class Aviary implements BasicAviary{
    private boolean isCleaned;

    public Aviary(boolean isCleaned) {
        this.isCleaned = isCleaned;
    }

    @Override
    public void cleaned() {
        if (isCleaned){
            System.out.println("the aviary is cleaned");
        } else {
            System.out.println("aviary is messy");
        }
    }
}
