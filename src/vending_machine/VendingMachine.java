package vending_machine;

import vending_machine.exceptions.ChocolatesAllGone;
import vending_machine.exceptions.ProductNotFoundException;
import vending_machine.products.Chocolates;
import vending_machine.products.Products;


public class VendingMachine

{

    private static int stock = 0;
    private ChocolatesAllGone Chocolates = new ChocolatesAllGone();

    public void buy(Products products) throws ProductNotFoundException {

        if (this.stock <= 0){

            if (products.equals(Chocolates)){
                throw new ChocolatesAllGone();
            }


        }else
            this.stock--;
    }

    public void addStock(Products products, int newStock){
        this.stock += newStock;
    }

    public int getStock() {
        return stock;
    }
}
