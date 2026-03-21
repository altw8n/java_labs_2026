package org.example.chapter02.task16;

public class Main {
    static void main() {
        Invoice invoice1 = new Invoice();
        invoice1.addItem("a", 1, 125000.0);
        invoice1.addItem(new Invoice.Item("b", 2, 8500.0));
        System.out.println(invoice1.getTotalAmount());
        invoice1.printInvoice();
    }
}
