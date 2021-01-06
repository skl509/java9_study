package com.study.java.ch02.ex15;

import java.util.ArrayList;

public class Invoice {
    private static class Item { // Item은 Invoice 안에 중첩되었다.
        String description;
        int quantity;
        double unitPrice;

        double price() { return quantity * unitPrice; }
        public String toString() {
            return quantity + " x " + description + " @ $" + unitPrice + " each";
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void print() {        //청구서 출력, 합계 계산해서 하는 메서드
        double total = 0;
        for (Item item : items) {
            System.out.println(item);
            total += item.price();
        }
        System.out.println(total);
    }

    public static void main(String[] args) { //청구서 만들고 출력
        Invoice invoice = new Invoice();
        invoice.addItem("플레이스테이션4 슬림", 1, 24.95);
        invoice.addItem("철권7 dlc 포함 풀 패키지", 1, 49.95);
        invoice.print();
    }
}
