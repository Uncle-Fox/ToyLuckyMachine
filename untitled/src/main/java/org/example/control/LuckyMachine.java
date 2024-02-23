package org.example.control;

import org.example.service.Toy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LuckyMachine{
    private PriorityQueue<Toy> toyQueue;

    public LuckyMachine() {
        toyQueue = new PriorityQueue<>(Comparator.comparingDouble(Toy::getChanseOut));
    }

    public void addToy(Toy toy){
        toyQueue.add(toy);
    }
    public Toy drawWinner(){
        return toyQueue.poll();
    }
    public boolean isEmpty(){
        return toyQueue.isEmpty();
    }
}