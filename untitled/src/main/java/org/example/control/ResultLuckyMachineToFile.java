package org.example.control;

import java.io.BufferedWriter;
import java.io.IOException;
public class ResultLuckyMachineToFile {
    private String filePath;

    public ResultLuckyMachineToFile(String filePath) {
        this.filePath = filePath;
    }

    public void writeToFile(String content) {
        ResultLuckyMachineToFile resultToFile = new ResultLuckyMachineToFile("ResultLuckyMachine.txt");
        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(filePath, true))) {
            writer.write(content);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}