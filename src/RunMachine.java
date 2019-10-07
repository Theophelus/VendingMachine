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

        //Adding products
        vendingMachine.addStock(chocolates,4);
        vendingMachine.addStock(saltySnacks, 5);
        vendingMachine.addStock(softDrinks,2);

        //Buying three chocolate
        vendingMachine.buy(chocolates);
        vendingMachine.buy(chocolates);
        vendingMachine.buy(chocolates);

        //Buying six Salty Snacks. Salty Snacks exceptions should be thrown.
        vendingMachine.buy(saltySnacks);
        vendingMachine.buy(saltySnacks);
        vendingMachine.buy(saltySnacks);
        vendingMachine.buy(saltySnacks);
        vendingMachine.buy(saltySnacks);
        vendingMachine.buy(saltySnacks);

        //Buying 2 soft drinks
        vendingMachine.buy(softDrinks);
        vendingMachine.buy(softDrinks);

        //Getting stack for all products
        System.out.println("Stock available: " + vendingMachine.getStock());


    }
}
