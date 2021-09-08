package com.codegym.controller;

import com.codegym.model.Product;

import java.util.LinkedList;
import java.util.List;

public class ProductManger implements GeneralManger<Product> {
    List<Product> listProduct = new LinkedList<>();

    @Override
    public void showProduct() {
        for (Product product :listProduct) {
            System.out.println(product);
        }
    }

    @Override
    public void addProduct(Product product) {
        listProduct.add(product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        int index = findById(id);
        listProduct.set(index, product);
    }

    @Override
    public void removeProduct(int id) {
        int index = findById(id);
        listProduct.remove(index);
    }

    @Override
    public void sortProduct() {
        listProduct.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
    }

    @Override
    public Product findHighestPrice() {
        Product productHighestPrice = null;
        for(int i=0;i<listProduct.size();i++){
            double priceNext = listProduct.get(i).getPrice();
            if(highestPrice() == priceNext){
                productHighestPrice = listProduct.get(i);
            }
        }
        return productHighestPrice;
    }

    public double highestPrice() {
        double highestPrice = listProduct.get(0).getPrice();
        for (int i = 1; i < listProduct.size(); i++) {
            final double priceNext = listProduct.get(i).getPrice();
            if (highestPrice < priceNext) {
                highestPrice = priceNext;
            }
        }
        return highestPrice;
    }

    public int findById(int id) {
        int index = -1;
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                return index = i;
            }
        }
        return index;
    }

    public void saveToFile(){
        for (Product product:listProduct) {
            ReadAndWriteCsv.writeFileCsv(product);
        }
    }

    public void readToFile(){
        ReadAndWriteCsv.readFileCsv();
    }
}
