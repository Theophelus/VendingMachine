package vending_machine.exceptions;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException() {
        System.out.println("Product not found");
    }
}
