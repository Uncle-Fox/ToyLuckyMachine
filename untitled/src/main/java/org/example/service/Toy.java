package org.example.service;

public class Toy{
    private int toyId;
    private String toyName;
    private double chanseOut;

    public Toy(int toyId, String toyName, double chanseOut) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.chanseOut = chanseOut;
    }

    public int getToyId() {
        return toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public double getChanseOut() {
        return chanseOut;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyId=" + toyId +
                ", toyName='" + toyName + '\'' +
                ", chanseOut=" + chanseOut +
                '}';
    }
}