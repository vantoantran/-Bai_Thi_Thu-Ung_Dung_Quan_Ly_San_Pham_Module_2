package com.codegym.controller;

import com.codegym.model.Product;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteCsv {
    static File file = new File("products.csv");
    public static final String DOWN_THE_LINE = "\n";

    public static void writeFileCsv(Product product) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(product + DOWN_THE_LINE);
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileCsv() {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str="";
            while ((str=bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            System.err.println("Fie does not exist or the content has an error!");
        }
    }
}
