package vending_machine;

import vending_machine.exceptions.ChocolatesAllGone;
import vending_machine.exceptions.ProductNotFoundException;
import vending_machine.exceptions.SaltyCracksAllEatenException;
import vending_machine.exceptions.SoftDrinkOutOfStockException;
import vending_machine.products.Chocolates;
import vending_machine.products.Products;
import vending_machine.products.SaltySnacks;
import vending_machine.products.SoftDrinks;


public class VendingMachine

{

    private int chocolateStock = 0;
    private int saltySanacks = 0;
    private int softDrink = 0;

    public  void buy(Products products) throws ProductNotFoundException {

        if (products != null) {
            if (products instanceof Chocolates) {
                if (this.chocolateStock <= 0) {
                    throw new ChocolatesAllGone();
                } else {
                    this.chocolateStock--;
                }
            }
            if (this.saltySanacks <= 0) {
                if (products instanceof SaltySnacks) {
                    throw new SaltyCracksAllEatenException();
                }
            } else {
                this.saltySanacks--;
            }

            if (this.saltySanacks <= 0) {
                if (products instanceof SaltySnacks) {
                    throw new SaltyCracksAllEatenException();
                }
            } else {
                this.softDrink--;
            }
        }else
            throw new ProductNotFoundException();
    }

    public void addStock(Products products, int newStock) {

           if (products instanceof Chocolates)
           this.chocolateStock += newStock;

           if (products instanceof SaltySnacks)
               this.saltySanacks += newStock;

           if (products instanceof SoftDrinks)
               this.softDrink +=newStock;

    }

    public int getStock() {
        return chocolateStock + saltySanacks + softDrink;
    }


}
