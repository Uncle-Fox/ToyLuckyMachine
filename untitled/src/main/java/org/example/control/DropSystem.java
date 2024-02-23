package org.example.control;

import org.example.service.Toy;
import org.example.view.View;

public class DropSystem {
    private LuckyMachine luckyMachine;
    private View view;

    public DropSystem(LuckyMachine luckyMachine, View view) {
        this.luckyMachine = luckyMachine;
        this.view = view;
    }

    public void startDrop(){
        while(!luckyMachine.isEmpty()){
            Toy toy = luckyMachine.drawWinner();
            view.view((toy));
        }
    }
}