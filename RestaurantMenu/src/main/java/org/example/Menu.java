package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Menu {
    private List<MenuItem> items = new ArrayList<>();
    private LocalDate lastUpdated;


    public Menu(ArrayList<MenuItem> items, LocalDate lastUpdated){
        this.items = items;
        this.lastUpdated =lastUpdated;
    }


    public void setLastUpdated(LocalDate lastUpdated){
        this.lastUpdated = lastUpdated;
    }
    public LocalDate getLastUpdated(){
        return this.lastUpdated;
    }
    public List<MenuItem> getItems() {
        return this.items;
    }
    public void addItems(MenuItem menuItem){
        this.items.add(menuItem);
    }

}
