package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

       // Ingredient ingredient = new Flavor();

        Comparator comparator = new FlavorComparator();
        Comparator coneComparator = new ConeComparator();
        Comparator toppingComparator = new ToppingComparator();

        for (Flavor item : flavors){
            System.out.println(item.getName() + ":" + item.getCost());

        }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        flavors.sort(comparator);
        for (Flavor item : flavors) {
            System.out.println(item.getName());
            System.out.println(item.getAllergens());
        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(coneComparator);
        for (Cone item : cones){
            System.out.println(item.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for(Flavor item : flavors) {
            System.out.println(item.getName() + ":" + item.getCost());
        }

        for(Topping item : toppings){
            System.out.println(item.getName());
        }

        toppings.sort(toppingComparator);

        for(Topping item : toppings){
            System.out.println(item.getName());
        }
    }
}