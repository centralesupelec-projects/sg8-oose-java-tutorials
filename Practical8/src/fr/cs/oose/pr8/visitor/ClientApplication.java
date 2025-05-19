package fr.cs.oose.pr8.visitor;

import java.util.ArrayList;

public class ClientApplication {

    public static void main(String[] args) {
        ArrayList<Item> products = new ArrayList<>();

        NormalPassenger v1 = new NormalPassenger();
        CorporatePassenger v2 = new CorporatePassenger();
        ExecutivePassenger v3 = new ExecutivePassenger();

        products.add(new Book(20, "The lord of the rings"));
        products.add(new Book(25, "Bel ami") );
        products.add(new Wine(60));
        products.add(new Cosmetic(150, Cosmetics.PERFUME));

        System.out.println("**** basic price visitor *****");
        double basic_price = calculatePrice(products, v1);
        System.out.println(basic_price);

        System.out.println("**** corporate price visitor *****");
        double corporate_price = calculatePrice(products, v2);
        System.out.println(corporate_price);

        System.out.println("**** executive price visitor *****");
        double executive_price = calculatePrice(products, v3);
        System.out.println(executive_price);
    }

    private static double calculatePrice(ArrayList<Item> shoppingCart, Passenger passenger) {
        double sum=0;
        for(Item item : shoppingCart)
            sum = sum + item.accept(passenger);
        return sum;
    }

}
