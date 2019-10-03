package vending_machine.exceptions;

public class SaltyCracksAllEatenException extends ProductNotFoundException {

    public SaltyCracksAllEatenException(){
        System.out.println("All eaten exception..!");
    }
}
