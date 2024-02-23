package org.example.control;

import org.example.service.Toy;
import org.example.view.View;

import java.util.PriorityQueue;
import java.util.Random;

public class LuckyMachine{
    private PriorityQueue<Toy> toyQueue;
    private Random random;

    ResultLuckyMachineToFile resultToFile = new ResultLuckyMachineToFile("ResultLuckyMachine.txt");
    public LuckyMachine() {
        toyQueue = new PriorityQueue<>((toy1, toy2) -> Double.compare(toy2.getChanseOut(), toy1.getChanseOut()));
        random = new Random();
    }
    public void addToy(Toy toy){
        toyQueue.add(toy);
    }
    public void startDropSystem(View view){
//        view.startNewDraw();
        resultToFile.writeToFile(view.startNewDraw());
        while(!toyQueue.isEmpty()){
            Toy toy = drawWinToy();
            if (toy != null){
                String res = view.view(toy);
                resultToFile.writeToFile(res);
            }
        }
        System.out.println("К сожалению все игрушки закончились.");
        resultToFile.writeToFile("К сожалению все игрушки закончились.");
    }

    public Toy drawWinToy(){
        Toy selectedToy = null;

        for (Toy toy : toyQueue) {
            double randomChance = random.nextDouble(); // Случайное число от 0.0 до 1.0
            if (randomChance <= toy.getChanseOut()) {
                selectedToy = toy;
                break;
            }
        }
        if(selectedToy != null) {
            toyQueue.remove(selectedToy);
        }
        return selectedToy;
    }
}