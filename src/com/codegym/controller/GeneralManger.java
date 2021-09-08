package com.codegym.controller;

import com.codegym.model.Product;

public interface GeneralManger<E> {
    void showProduct();

    void addProduct(E e);

    void updateProduct(int id, Product product);

    void removeProduct(int id);

    void sortProduct();

    Product findHighestPrice();



}
