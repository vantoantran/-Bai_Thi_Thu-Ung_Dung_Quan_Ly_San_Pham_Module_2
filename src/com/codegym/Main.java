package com.codegym;

import com.codegym.controller.ProductManger;
import com.codegym.controller.ReadAndWriteCsv;
import com.codegym.model.Product;
import com.codegym.view.ProductMenu;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ProductMenu.run();
    }
}
