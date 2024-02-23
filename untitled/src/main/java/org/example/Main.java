package org.example;

//TODO
// Функционал: Добавление новых игрушек с весом выпадения


import org.example.control.Control;
import org.example.control.ResultLuckyMachineToFile;
import org.example.control.LuckyMachine;
import org.example.service.*;
import org.example.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        // Создание трех машин по розыгрышу игрушек
        LuckyMachine toyMachine1 = new LuckyMachine();
        Control control = new Control(toyMachine1, view);
        LuckyMachine toyMachine2 = new LuckyMachine();
        Control control2 = new Control(toyMachine2, view);
        LuckyMachine toyMachine3 = new LuckyMachine();
        Control control3 = new Control(toyMachine3, view);

        // Создание и добавление новых игрушек
        Toy toy1 = new ToyCar(1, "Toy Car Jeep", 0.3);
        Toy toy4 = new ToyCar(4, "Toy Car", 0.3);
        Toy toy2 = new ToyRobot(2, "Toy Robot T1000", 0.2);
        Toy toy3 = new ToyTeddyBear(3, "Toy Teddy Bear Pooh", 0.5);
        Toy toy5 = new ToyRobot(5, "Toy Robot 7", 0.35);

        control.addNewToys(toy1, toy2, toy3, toy4, toy5);
        control2.addNewToys(toy1, toy4, toy5);
        control3.addNewToys(toy1, toy2, toy3, toy5);


        // Запуск системы розыгрыша
        control.startDropSystem();
        control2.startDropSystem();
        control3.startDropSystem();
    }
}