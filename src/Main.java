import Products.Clothing;
import Products.Electronics;
import Products.Furniture;
import Products.Inventory;

public class Main {


    public static void main(String[] args) {

       Inventory<Electronics> electronicsInventory = new Inventory<>();

        Electronics e1 = new Electronics("Phone", 96.54);
        Electronics e2 = new Electronics("Razor", 42);
        Electronics e3 = new Electronics("PC", 1500);

        Clothing c1 = new Clothing("Skirt", 56.33);
        Furniture t1 = new Furniture("Table", 100.00);



    electronicsInventory.addItem(e1);
    electronicsInventory.addItem(e2);
    electronicsInventory.addItem(e3);


    electronicsInventory.getItemByName("razor");

    electronicsInventory.sortByPrice();
    electronicsInventory.displayInventory();



    }
}
