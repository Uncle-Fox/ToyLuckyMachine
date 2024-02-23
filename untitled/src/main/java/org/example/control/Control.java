package org.example.control;

import org.example.service.Toy;
import org.example.view.View;

import java.util.List;

public class Control {
    private LuckyMachine luckyMachine;
    private View view;
    private List<Toy> drawResults;

    public Control(LuckyMachine luckyMachine, View view) {
        this.luckyMachine = luckyMachine;
        this.view = view;
    }
    public void addNewToys(Toy... toys){
        for(Toy toy: toys){
            luckyMachine.addToy(toy);
        }
    }
    public void startDropSystem(){
        luckyMachine.startDropSystem(view);
    }
}