package vending_machine.exceptions;

public class SoftDrinkOutOfStockException extends ProductNotFoundException {
    public SoftDrinkOutOfStockException (){

        System.out.println(" Soft Drinks Out Of Stock Exception");
    }
}
