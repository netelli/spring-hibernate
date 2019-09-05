package com.study.springdemo;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {
    private ArrayList<String> theFortunes;
    private String fileName = "fortune-data.txt";
    private Random random = new Random();

    public FileFortuneService() {
        getFortunesList();
    }

    private ArrayList<String> getFortunesList() {
        File theFile = new File(FileFortuneService.class.getResource("/" + fileName).getFile());

        System.out.println("Reading fortunes from file: " + theFile);
        System.out.println("File exists: " + theFile.exists());

        // initialize array list
        theFortunes = new ArrayList<String>();

        // read fortunes from file
        try (BufferedReader br = new BufferedReader(
                new FileReader(theFile))) {

            String tempLine;

            while ((tempLine = br.readLine()) != null) {
                theFortunes.add(tempLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getFortune() {
        return theFortunes.get(random.nextInt(theFortunes.size()));
    }
}
