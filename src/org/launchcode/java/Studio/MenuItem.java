package org.launchcode.java.Studio;

public class menuItem(){


  public menuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }
};
menuItem myMenuItem = new menuItem("pizza", 8.09, "Cheesy", "carbs");


System.out.println(myMenuItem);

