package com.minchen.august23;

public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();
    private  HungrySingleton(){};
    private static HungrySingleton getInstance(){
        return instance;
    }
}
