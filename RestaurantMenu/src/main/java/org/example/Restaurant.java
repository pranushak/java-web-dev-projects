package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Hello world!");


    MenuItem m1 = new MenuItem("Mac and Cheese","Main Course",3.00,"Pasta with cheese");
    MenuItem m2= new MenuItem("Brownie","Dessert",4.00,"Cocoa and flour");
    MenuItem m3 =new MenuItem("Fried rice","Main  Course",4.00," Stir fried rice and vegetables");
    MenuItem m4 = new MenuItem("Meatballs", "Appetizer", 2.00, "Ground meat rolled into a ball");

    ArrayList<MenuItem> listItems = new ArrayList<>();
    listItems.add(m1);
    listItems.add(m2);
    listItems.add(m3);
    listItems.add(m4);
    Menu menu = new Menu(listItems, LocalDate.now());

        System.out.println("MENU");
        System.out.println("Last Updated:" + menu.getLastUpdated());
       for(MenuItem item : listItems){
           if(item.getCategory().equals("Main Course")) {
               System.out.println("MAIN COURSE");
               System.out.print(item.getName()+ "\n" +item.getDescription() + "\n" + item.getPrice());
           }else if(item.getCategory().equals("Dessert")){
               System.out.print("\nDESSERT\n");
               System.out.print(item.getName()+ "\n" + item.getDescription()+ "\n" + item.getPrice());
           }else{
               System.out.print("\nAPPETIZER\n");
               System.out.print(item.getName()+ "\n" + item.getDescription()+ "\n" + item.getPrice());
           }

       }
    }

}