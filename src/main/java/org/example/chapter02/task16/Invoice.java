package org.example.chapter02.task16;

import java.util.ArrayList;

public class Invoice {
    public static class Item {
        private String description;
        private int quantity;
        private double unitPrice;

        public String getDescription() {
            return description;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
        }

        public double getTotalPrice() {
            return quantity * unitPrice;
        }

        public Item(String description, int quantity, double unitPrice){
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;

        }
    }
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void addItem(String description, int quantity, double unitPrice){
        items.add(new Item(description, quantity, unitPrice));
    }

    public boolean removeItem(int index){
        if (index >= 0 && index < items.size()){
            items.remove(index);
            return true;
        }
        return false;
    }

    public boolean removeItem(String description){
        for (int i = 0; i < items.size(); ++i){
            if (items.get(i).getDescription().equals(description)){
                items.remove(i);
                return true;
            }
        }
        return false;
    }
}
