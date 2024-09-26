package Products;

import Interfaces.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Inventory<T extends Product> {


    private final List<T> items = new ArrayList<>();


    public void addItem(T item) {
        items.add(item);
        System.out.println("Item: " + item.getName() + " added to inventory.");
    }

    public void removeItem(T item) {
        items.remove(item);
        System.out.println("Item: " + item.getName() + " removed from inventory.");
    }

    public void displayInventory() {

        if (items.isEmpty()) {
            System.out.println("Inventory is currently empty.");
            return;
        }
        System.out.println();


        String className = items.get(0).getClass().getSimpleName().toUpperCase();
        System.out.println(className + " INVENTORY: ");

        for (T product : items) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice());
        }
    }


    public List<T> getItems() {
        return items;
    }

    public T getItemByIndex(int index) {
        if (index < 0 || index >= items.size()) {
            System.out.println("Index out of bounds");
            return null;
        }
        return items.get(index);
    }

    public void getItemByName(String name) {


        for (T product : items) {
            if (name.equalsIgnoreCase(product.getName())) {
                System.out.println("Item found: " + product.getName() + ", " + product.getPrice() + " RUB");
                return;
            }
        }
        System.out.println("Item " + "'" + name + "'" + " not found.");

    }


    public void getTotalInventoryValue() {

        double totalValue = 0;

        for (T product : items) {
            totalValue += product.getPrice();
        }

        String className = items.get(0).getClass().getSimpleName();
        System.out.println("\nTotal " + className + " Inventory Value: " + totalValue);

    }


    //alphabetical
    public void sortByName() {
        items.sort(Comparator.comparing(Product::getName));
        System.out.println("\nInventory sorted by name (alphabetically)");
    }

    //descending
    public void sortByPrice() {
        items.sort(Comparator.comparing(Product::getPrice));
        System.out.println("\nInventory sorted by price (ascending)");
    }


}
