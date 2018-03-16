package com.example.tranlinh.demoswitchandbutton;

/**
 * Created by tranlinh on 17/03/2018.
 */

public class Item {
    private boolean isOn;
    private String name;

    public  Item(){
        this.isOn = false;
    }
    public Item(String name){
        this.name = name;
    }
    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
