import vending_machine.VendingMachine;
import vending_machine.exceptions.ChocolatesAllGone;
import vending_machine.exceptions.ProductNotFoundException;
import vending_machine.exceptions.SaltyCracksAllEatenException;
import vending_machine.exceptions.SoftDrinkOutOfStockException;
import vending_machine.products.Chocolates;
import vending_machine.products.Products;
import vending_machine.products.SaltySnacks;
import vending_machine.products.SoftDrinks;

public class RunMachine {


    public static void main(String[] args){
        VendingMachine vendingMachine  = new VendingMachine();

        Products chocolates = new Chocolates("Bar One");
        Products saltySnacks = new SaltySnacks("Peanuts");
        Products softDrinks = new SoftDrinks("Coke");

        //Adding products
        vendingMachine.addStock(chocolates,2);
        vendingMachine.addStock(saltySnacks, 3);
        vendingMachine.addStock(softDrinks,2);

        try {
            //Buying three chocolate and catching exceptions
            vendingMachine.buy(chocolates);
            vendingMachine.buy(chocolates);
            //Buying three Salty Snacks. Salty Snacks
            vendingMachine.buy(saltySnacks);
            vendingMachine.buy(saltySnacks);
            vendingMachine.buy(saltySnacks);

             //Buying three soft drinks, but there is only two available exceptions should be handled.
            vendingMachine.buy(softDrinks);
            vendingMachine.buy(softDrinks);
            vendingMachine.buy(softDrinks);

        }catch (ChocolatesAllGone | SaltyCracksAllEatenException | SoftDrinkOutOfStockException ex) {
            System.out.println();
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }

        //Getting stack for all products
        System.out.println("Stock available: " + vendingMachine.getStock());


    }
}
