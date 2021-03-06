/**
 * @project Milestone2
 * @course CST-135
 * @author James Ray
 * @author Christopher Hyde
 * @author Jesus Leon
 * @author Robert Wayde
 * @teacher Dr. Lively
 * @date 12/16/17
 */
package vendingMachine.classes;

import vendingMachine.classes.products.Chips;
import vendingMachine.classes.products.Candy;
import vendingMachine.classes.products.Drink;
import vendingMachine.classes.products.Gum;
import vendingMachine.classes.products.Product;

import java.util.ArrayList;

/**
 * @author Christopher Hyde
 */
public class Dispenser {

    /**
     * ArrayList of Products
     */
    private ArrayList<Product> productList = new ArrayList<>();

    /**
     * Balance in vendingMachine
     */
    private double balance;

    /**
     * Number of sales made
     */
    private int totalSales;

    /**
     * Create a Dispenser with generic information.
     */
    public Dispenser() {
        this.productList = new ArrayList<Product>();
        this.balance = 20.00;
        this.totalSales = 0;
    }

    /**
     * Create Dispenser with specific info and Generated productList
     */
    public Dispenser(double balance, int totalSales) {
        productListFiller(); // Fill the productList with products
        this.balance = balance; // The amount of money for change giving before any sales are made.
        this.totalSales = totalSales;
    }

    /**
     * Returns a string of what is in the Dispenser and how many sales.
     *
     * @return String
     */
    @Override
    public String toString() {

        // Return the inventory string along with the balance and totalSales of the Dispenser.
        return "Inventory:\n" + displayProducts() + "Balance: " + getBalance() + "\nTotal Sales:" + getTotalSales();
    }

    /**
     * Returns a string of what products are in the dispenser.
     *
     * @return String
     */
    public String displayProducts() {
        String inventory = "";

        // Create a single string containing every product in the Dispenser
        for (int i = 0; i < getProductList().size(); i++) {
            inventory += i + ": " + getProductList().get(i) + "\n\n";
        }

        return inventory;
    }

    /**
     * Fill the productList with products
     */
    public void productListFiller() {
        // Varaity of products that will be placed in the productList ArrayList<Product>

        //Chips
        productList.add(new Chips("Barbecue", 1, false, false, 1, 139, "Lays", 0.99, 10, "A1", "lays_bbq.jpg"));
        productList.add(new Chips("Classic", 1, false, false, 1, 152, "Lays", 0.99, 10, "A2", "lays_classic.jpg"));
        productList.add(new Chips("Original", 1, true, false, 1, 160, "Fritos", 0.99, 10, "A3", "fritos_original.jpg"));
        productList.add(new Chips("Chili Cheese", 1, true, false, 1, 160, "Fritos", 0.99, 10, "A4", "fritos_chili_cheese.jpg"));
        productList.add(new Chips("Cool Ranch", 1, true, false, 1, 180, "Dorito", 0.99, 10, "A5", "doritos_nacho_cheese.jpg"));
        productList.add(new Chips("Nacho Cheese", 1, true, false, 1, 120, "Dorito", 0.99, 10, "A6", "doritos_cool_ranch.jpg"));

        //Candy
        productList.add(new Candy(1, "Mix Fruit", false, false, 2.17, 251, "Skittkes", 1.00, 20, "B1", "skittles.jpg" ));
        productList.add(new Candy(1, "Peanutbutter & Chocolate", false, false, 1.53, 176, "Resees's", 1.25, 20, "B2", "resees.jpg" ));
        productList.add(new Candy(1, "Mix Fruit", false, false, 2.07, 160, "Starburst", 1.00, 20, "B3", "starburst.jpg" ));
        productList.add(new Candy(1, "Milk Chocolate", false, false, 1.69, 230, "M&M's", 1.00, 20, "B4", "m_and_m.jpg" ));
        productList.add(new Candy(1, "Milk Chocolate", false, false, 1.55, 214, "Hershey Bar", 1.25, 20, "B5", "hershy.jpg" ));
        productList.add(new Candy(1, "Chocolate", false, false, 2.00, 266, "Snickers", 1.00, 20, "B6", "snickers.jpg" ));

        //Gum
        productList.add(new Gum("Tropical Twist", 8, 1, true, 21.2, 1, "Tridant", 0.50, 10, "C1", "trident_tropical_twist.jpg"));
        productList.add(new Gum("Cinnamon", 8, 1, true, 21.2, 1, "Tridant", 0.50, 10, "C2", "trident_cinnamon.jpg"));
        productList.add(new Gum("Original", 8, 1, true, 21.6, 1, "Juicy Fruit", 0.75, 10, "C3", "juicy_fruit.jpg"));
        productList.add(new Gum("Sour Watermelon", 8, 1, true, 21.6, 1, "Juicy Fruit", 0.75, 10, "C4", "juicy_fruit_sour_watermelon.jpg"));
        productList.add(new Gum("Cinnamon", 5, 1, false, 13.5, 10, "Big Red", 0.35, 10, "C5", "big_red.jpg"));
        productList.add(new Gum("Doublemint", 5, 1, false, 13.3, 10, "Wrigley's", 0.35, 10, "C6" , "doublmint.jpg"));

        //Drinks
        productList.add(new Drink(16, "Soft Drink", 187, false, 1, "Coca-Cola", 1.25, 10, "D1", "coca-cola.jpg"));
        productList.add(new Drink(16, "Soft Drink", 0, true, 1, "Diet Coca-Cola", 1.25, 10, "D2", "diet_coca-cola.jpg"));
        productList.add(new Drink(16, "Soft Drink", 200, false, 1, "Pepsi", 1.25, 10, "D3", "pepsi.jpg"));
        productList.add(new Drink(16, "Soft Drink", 0, true, 1, "Diet Pepsi", 1.25, 10, "D4", "diet_pepsi.jpg"));
        productList.add(new Drink(16, "Water", 0, true, 0, "Arrowhead Drinking Water", 1.00, 10, "D5", "arrowhead_water.jpg"));
        productList.add(new Drink(16, "Sports Drink", 80, false, 0, "Gatorade Fruit Punch", 1.00, 10, "D6", "gatorade_fruit_punch.jpg"));
    }

    /**
     * Change product in productList at Index
     *
     * @param index
     * @param product
     */
    public void changeProduct(int index, Product product) {
        getProductList().remove(index); //remove the product currently in that index.
        getProductList().add(index, product); // Add the new product to that index.
    }

    /**
     * Returns the ArrayList<Product> pruductList.
     *
     * @return productList
     */
    public ArrayList<Product> getProductList() {
        return productList;
    }

    /**
     * Sets the productList to a new ArrayList<Product>
     *
     * @param productList
     */
    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    /**
     * Returns the balance of the Dispencer
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the balance of the Dipenser
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Returns the totalSales of the Dispenser
     *
     * @return totalSales
     */
    public int getTotalSales() {
        return totalSales;
    }

    /**
     * Set the totalSales of the Dispernser
     *
     * @param totalSales
     */
    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }
}
