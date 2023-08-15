package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isExtraCheese;
    private boolean isExtraToppings;
    private boolean isBagged;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price = isVeg ? 300 : 400;

        this.isExtraCheese = false;
        this.isExtraToppings = false;
        this.isBagged = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!isExtraCheese) {
            isExtraCheese = true;
            price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!isExtraToppings) {
            isExtraToppings = true;
            price += isVeg ? 70 : 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!isBagged) {
            isBagged = true;
            price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        bill = "";
        bill += "Base Price Of The Pizza: " + (isVeg ? 300 : 400) + "\n";
        if (isExtraCheese) {
            bill += "Extra Cheese Added: 80\n";
        }
        if (isExtraToppings) {
            bill += "Extra Toppings Added: " + (isVeg ? 70 : 120) + "\n";
        }
        if (isBagged) {
            bill += "Paperbag Added: 20\n";
        }
        bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
