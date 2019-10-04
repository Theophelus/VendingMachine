import vending_machine.VendingMachine;
import vending_machine.exceptions.ProductNotFoundException;
import vending_machine.products.Chocolates;
import vending_machine.products.Products;
import vending_machine.products.SaltySnacks;
import vending_machine.products.SoftDrinks;

public class RunMachine {


    public static void main(String[] args) throws ProductNotFoundException {


        VendingMachine vendingMachine  = new VendingMachine();
        Products chocolates = new Chocolates("Bar One");
        Products saltySnacks = new SaltySnacks("Peanuts");
        Products softDrinks = new SoftDrinks("Coke");
        //Adding product
        vendingMachine.addStock(softDrinks,2);
        vendingMachine.addStock(saltySnacks, 1);
        vendingMachine.addStock(chocolates, 8);

        System.out.println("Stock available: " + vendingMachine.getStock());
    }
}
