package Products;

import Interfaces.Product;

public class Electronics implements Product {


    private final String name;
    private final double price;
    private final String category;


    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
        this.category = "Electronics";
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void getDescription() {
        System.out.println( "\nPRODUCT DESCRIPTION: \n" +

                "\nProduct: " + getName() +
                "\nPrice: " + getPrice() +
                "\nCategory: " + getCategory() );

    }
}
