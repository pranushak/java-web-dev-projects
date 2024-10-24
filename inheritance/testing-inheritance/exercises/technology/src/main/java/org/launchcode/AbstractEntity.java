package org.launchcode;

public abstract class AbstractEntity {
    private int id;
    public AbstractEntity(){
        id = id + 1;
    }
    public int getID() {
        return id;
    }
}
