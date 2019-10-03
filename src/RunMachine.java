import vending_machine.VendingMachine;
import vending_machine.exceptions.ProductNotFoundException;
import vending_machine.products.Chocolates;
import vending_machine.products.Products;

public class RunMachine {


    public static void main(String[] args) throws ProductNotFoundException {


        VendingMachine vendingMachine  = new VendingMachine();
        Products chocolates = new Chocolates("Bar One");
        //Adding product
        vendingMachine.addStock(chocolates, 0);

            vendingMachine.buy(chocolates);


        System.out.println(vendingMachine.getStock());

    }
}
