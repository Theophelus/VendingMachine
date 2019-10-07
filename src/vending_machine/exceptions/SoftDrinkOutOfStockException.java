package vending_machine.exceptions;

public class SoftDrinkOutOfStockException extends ProductNotFoundException {
    public SoftDrinkOutOfStockException (){
        super();
        System.out.println(" Soft Drinks Out Of Stock..!");
    }
}
