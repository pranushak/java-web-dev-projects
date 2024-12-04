package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        Spinnable cd = new CD(120, 250, "700 MB","Jumbo CD");
        Spinnable dvd = new DVD(600, 2600,"14 GB","DVD-5");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        Spinnable floppyDisc = new FloppyDisc(100,360, "1.4 MB", " 8-inch");
        cd.spinDisc();
        dvd.spinDisc();
        floppyDisc.spinDisc();

        Spinnable wheel = new Wheels();
        wheel.spinDisc();
        Spinnable frisbee = new Frisbees();
        frisbee.spinDisc();
    }

}