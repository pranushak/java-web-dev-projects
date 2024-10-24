package org.launchcode;

public class Laptop extends Computer {
    private String size;
    private int batteryLife;
    public Laptop(String aName,String aProcessor, int aRam,String aSize, int aBatteryLife){
        super(aName,aProcessor,aRam);
        size = aSize;
        batteryLife = aBatteryLife;
    }

    public String getSize(){
        return size;
    }
    public void setSize(String aSize){
        size = aSize;
    }
    public int getBatteryLife(){
        return batteryLife;
    }
    public void setBatteryLife(int aBatteryLife){
        batteryLife = aBatteryLife;
    }
    public void useBattery(){
        batteryLife--;
        System.out.println("Battery life remaining: "+ batteryLife + "hours");
    }

    @Override
    public int getID() {
        return 0;
    }
}
