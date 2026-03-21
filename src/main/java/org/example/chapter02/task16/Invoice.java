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

        public String toFormattedString() {
            return String.format("%-30s %4d x %8.2f = %10.2f",
                    description, quantity, unitPrice, getTotalPrice());
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

    public Item getItem(int index){
        if (index >= 0 && index < items.size()){
            return items.get(index);
        }
        return null;
    }

    public double getTotalAmount() {
        double total = 0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void printInvoice() {
        System.out.println("\n" + "=".repeat(80));
        System.out.println("                          СЧЕТ №" + System.currentTimeMillis() % 10000);
        System.out.println("                          " + new java.util.Date());
        System.out.println("=".repeat(80));

        if (items.isEmpty()) {
            System.out.println("                    СЧЕТ ПУСТ");
            System.out.println("=".repeat(80));
            return;
        }
        System.out.printf("%-30s %10s %12s %15s%n",
                "НАИМЕНОВАНИЕ", "КОЛ-ВО", "ЦЕНА", "СУММА");
        System.out.println("-".repeat(80));

        for (Item item : items) {
            System.out.println(item.toFormattedString());
        }
        System.out.println("-".repeat(80));

        double subtotal = getTotalAmount();

        System.out.printf("%-30s %10s %12s %15.2f%n",
                    "ИТОГО:", "", "", subtotal);

        System.out.println("=".repeat(80));
    }
}
