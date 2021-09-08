package com.codegym.view;

import com.codegym.controller.ProductManger;
import com.codegym.model.Product;
import sun.applet.Main;

import static com.codegym.Main.*;

public class ProductMenu {

    static ProductManger productManger = new ProductManger();

    public static void run() {
        int select;
        do {
            showMenu();
            select = input.nextInt();
            exception(select);

            switch (select) {
                case 1:
                    showAllProduct();
                    break;
                case 2:
                    addNewProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    sortProduct();
                    break;
                case 6:
                    findHighestPrice();
                    break;
                case 7:
                    readToFile();
                    break;
                case 8:
                    saveToFile();
                    break;
            }

        } while (select != 9);
    }

    private static void saveToFile() {
        System.out.print("You want to save changes? y/n:");
        input.nextLine();
        String changes = input.nextLine();
        if (changes.equals("y")) {
            productManger.saveToFile();
        }

    }

    private static void readToFile() {
        productManger.readToFile();
    }

    private static void findHighestPrice() {
        productManger.findHighestPrice();
    }

    private static void sortProduct() {
        productManger.sortProduct();
    }

    private static void deleteProduct() {
        System.out.print("Input product id to delete");
        int id = input.nextInt();
        productManger.removeProduct(id);
    }

    private static void updateProduct() {
        System.out.print("Input product id to update");
        int id = input.nextInt();
        productManger.updateProduct(id, inputProduct());
    }

    private static void addNewProduct() {
        productManger.addProduct(inputProduct());
    }

    private static Product inputProduct() {
        System.out.print("Input product id:");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Input product name:");
        String name = input.nextLine();
        System.out.print("Input product price:");
        double price = input.nextDouble();
        System.out.print("Input product quantity:");
        int quantity = input.nextInt();
        input.nextLine();
        System.out.print("input product about:");
        String about = input.nextLine();
        Product product = new Product(id, name, price, quantity, about);
        return product;
    }

    private static void showAllProduct() {
        productManger.showProduct();
    }

    private static void exception(int select) {
        if (select < 0 || select > 9) {
            System.err.println("Invalid selection, select again!!!");
        }
    }

    private static void showMenu() {
        System.out.println("----Product management program----");
        System.out.println("Select function by number(to continue)");
        System.out.println("1. Show product list");
        System.out.println("2. Add a product new in list");
        System.out.println("3. Update product in list");
        System.out.println("4. Delete product in list");
        System.out.println("5. Sort product in list");
        System.out.println("6. Find product is highest price");
        System.out.println("7. Read to file");
        System.out.println("8. Write to fie");
        System.out.println("9. exit");
        System.out.print("--> select function: ");
    }
}
