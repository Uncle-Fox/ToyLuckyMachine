package org.example.view;

import org.example.control.ResultLuckyMachineToFile;
import org.example.service.Toy;

public class View {
    public void view(Toy toy) {
        System.out.println("Поздравляем! Вы выиграли " + toy.getToyName() + ". Шанс выпадения этой игрушки: "
                + toy.getChanseOut());
    }
    public void startNewDraw() {
        System.out.println("<-- Начало нового розыгрыша! -->");
    }
}