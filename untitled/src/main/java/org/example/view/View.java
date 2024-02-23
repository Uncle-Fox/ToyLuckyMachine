package org.example.view;

import org.example.service.Toy;

public class View {
    public void view(Toy toy) {
        if(toy != null){
            System.out.println("Поздравляем! Вы выиграли " + toy.getToyName());
        } else {
            System.out.println("К сожалению все игрушки закончились.");
        }
    }
}
