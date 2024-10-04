package org.example;

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Hello world!");


    MenuItem m1 = new MenuItem("Mac and Cheese","Main Course",3.00,"Pasta with cheese");
    MenuItem m2= new MenuItem("Brownie","Dessert",4.00,"Cocoa and flour");
    MenuItem m3 =new MenuItem("Fried rice","Main  Course",4.00," Stir fried rice and vegetables");
    MenuItem m4 = new MenuItem("Meatballs", "Appetizer", 2.00, "Ground meat rolled into a ball");

    Menu menu = new Menu();
    menu.items.add(m1);
    menu.items.add(m2);
    menu.items.add(m3);
    menu.items.add(m4);
        for(MenuItem item:menu.items)
        {
            if(item.getCategory().equals("Dessert")){
                dessert.append
                System.out.println(item.toString());  
            }

        }


    }





}