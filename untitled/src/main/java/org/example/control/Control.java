package org.example.control;

import org.example.service.Toy;
import org.example.view.View;

public class Control {
    private LuckyMachine luckyMachine;
    private DropSystem dropSystem;
    private View view;

    public Control(LuckyMachine luckyMachine, DropSystem dropSystem, View view) {
        this.luckyMachine = luckyMachine;
        this.dropSystem = dropSystem;
        this.view = view;
    }
    public void addNewToys(Toy... toys){
        for(Toy toy: toys){
            luckyMachine.addToy(toy);
        }
    }

    public void startDropSystem(){
        dropSystem.startDrop();
    }
}