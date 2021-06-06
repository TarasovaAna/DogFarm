package com.leverx.farm.classes;

public interface Base {
    void getHungry(int amount);
    void getFed(int amount);
    void getTrained();
    void getSick();
    void info();
    void foodInfo();
}
