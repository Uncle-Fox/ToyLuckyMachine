package org.example.view;

import org.example.service.Toy;

public class View {
    public String view(Toy toy) {
         System.out.println("Поздравляем! Вы выиграли " + toy.getToyName() + ". Шанс выпадения этой игрушки: "
                + toy.getChanseOut());
        return ("Поздравляем! Вы выиграли " + toy.getToyName() + ". Шанс выпадения этой игрушки: "
                + toy.getChanseOut());
    }
    public String startNewDraw() {
        System.out.println("<-- Начало нового розыгрыша! -->");
        return ("<-- Начало нового розыгрыша! -->");
    }
}