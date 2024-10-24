package org.launchcode;

public class Computer extends AbstractEntity {
    private String name;
    private String processor;
    private int ram;

    public Computer(String aName, String aProcessor, int aRam){
        name = aName;
        processor = aProcessor;
        ram = aRam;
    }

    public String getName(){
        return name;
    }
    public void setName(String aName){
        name = aName;
    }

    public String getProcessor(){
        return processor;
    }
    public void setCpuSpeed(String aProcessor){
        processor = aProcessor;
    }

    public int getRam(){
        return ram;
    }
    public void setRam(int aRam){
        ram = aRam;
    }

    public void display(){
        System.out.println("Brand : "+' ' + name);
        System.out.println("Processor: "+ ' ' + processor);
        System.out.println("RAM: "+ ram + "GB");
    }
    public void shutdown(){
        System.out.println("Shutting down the "+ name + "computer");
    }
}
