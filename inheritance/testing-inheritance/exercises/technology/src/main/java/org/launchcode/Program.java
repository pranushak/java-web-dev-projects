package org.launchcode;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Computer comp = new Computer("mac","i7", 120);
        Laptop lap = new Laptop("Hp","i5",100,"3 inches",10);
        SmartPhone ph = new SmartPhone("moto","i2",32,"Android");
        comp.display();
        lap.display();
        ph.display();
        System.out.println(lap.getID());
        System.out.println(ph.getID());
        ph.makeCall(762636565);
        Computer comp1 = new Laptop("lenovo","i9",110,"2 inches",11);
        Computer mobile = new SmartPhone("nokia","i1",10,"android");
        ((SmartPhone) mobile).makeCall(12345678);
        ((Laptop) comp1).useBattery();
    }
}