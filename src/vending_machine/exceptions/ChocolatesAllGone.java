package vending_machine.exceptions;

import vending_machine.products.Chocolates;

public class ChocolatesAllGone extends ProductNotFoundException {

    public ChocolatesAllGone(){
        super();
        System.out.println("Chocolate All gone Exception");
    }
}
