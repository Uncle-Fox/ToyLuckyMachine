package org.example;

//TODO
// Функционал: Добавление новых игрушек с весом выпадения


import org.example.control.Control;
import org.example.control.DropSystem;
import org.example.control.LuckyMachine;
import org.example.service.*;
import org.example.view.View;

public class Main {
    public static void main(String[] args) {
        LuckyMachine luckyMachine = new LuckyMachine();

        View view = new View();
        DropSystem dropSystem = new DropSystem(luckyMachine, view);
        Control control = new Control(luckyMachine, dropSystem, view);

        // Создание и добавление новых игрушек
        Toy toy1 = new ToyCar(1, "Toy Car Jeep", 0.3);
        Toy toy4 = new ToyCar(1, "Toy Car", 0.3);
        Toy toy2 = new ToyRobot(2, "Toy Robot T1000", 0.2);
        Toy toy3 = new ToyTeddyBear(3, "Toy Teddy Bear Pooh", 0.5);
        Toy toy9 = new ToyTeddyBear(3, "Toy Teddy Bear 7", 0.5);
        Toy toy5 = new ToyRobot(2, "Toy Robot", 0.2);
        Toy toy6 = new ToyTeddyBear(3, "Toy Teddy Bear", 0.5);
        Toy toy7 = new ToyCar(1, "Toy Car 7", 0.3);
        Toy toy8 = new ToyRobot(2, "Toy Robot 7", 0.2);

        control.addNewToys(toy1, toy2, toy3, toy4, toy5, toy6, toy7, toy8, toy9);

        // Запуск системы розыгрыша
        control.startDropSystem();
    }
}