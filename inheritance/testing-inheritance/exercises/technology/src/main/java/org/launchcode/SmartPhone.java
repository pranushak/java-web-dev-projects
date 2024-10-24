package org.launchcode;

public class SmartPhone extends Computer{
    private String osName;
    public SmartPhone(String aName, String aProcessor, int aRam, String aOSName){
        super(aName,aProcessor,aRam);
        osName = aOSName;
    }
    public String getOsName(){
        return osName;
    }
    public void setOsName(String aOsName){
        osName = aOsName;
    }

    public void makeCall(int phoneNumber){
        System.out.println("making a call to " + phoneNumber + " on " + getName() + " smartphone ");
    }
}
