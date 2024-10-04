package org.example;

import java.util.Date;

public class MenuItem {
   private String name;
   private String category;
   private Double price;
   private String description;
   private Date dateAdded;


   public MenuItem(String name,String category,Double price,String description){
       this.name=name;
       this.category=category;
       this.price=price;
       this.description=description;
       this.dateAdded = dateAdded;
   }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
