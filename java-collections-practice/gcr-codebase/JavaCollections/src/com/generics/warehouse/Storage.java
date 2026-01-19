package com.generics.warehouse;

import java.util.ArrayList;
import java.util.List;
import com.generics.warehouse.WarehouseItem;

// generic storage class
public class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    // wildcard method to show all warehouse items
    public static void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            item.displayInfo();
        }
    }
}
