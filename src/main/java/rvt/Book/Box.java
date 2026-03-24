package rvt.Book;

import java.util.ArrayList;

public class Box implements Packable {
    private int max_weight;
    private ArrayList<Packable> items;

    public Box(int max_weight) {
        this.max_weight = max_weight;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        this.items.add(item);
    }

    @Override
    public double weight() {
        double total = 0.0;
        for (Packable item : items) {
            total += item.weight();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight: " + this.weight() + " kg";
    }
}