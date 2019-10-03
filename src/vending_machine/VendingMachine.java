package vending_machine;

import vending_machine.exceptions.ProductNotFoundException;
import vending_machine.products.Products;
//import vending_machine.products.Products;

public class VendingMachine

{

    private static int stock = 0;

    public void buy(Products products) throws ProductNotFoundException {

        if (this.stock < 0){
            throw new ProductNotFoundException();
        }else
            this.stock++;
    }

    public void addStock(Products products, int newStock){
        this.stock += newStock;
    }

    public int getStock() {
        return stock;
    }
}
