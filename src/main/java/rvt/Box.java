package rvt;

import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> packables;
    private double maxWeight;

    public Box(double maxWeight) {
        this.packables = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void add(Packable packable) {
   
        if (this.weight() == this.maxWeight) {
            System.out.println("Box is full, can't add more!");
        }  
        else if (packable.weight() + this.weight() < maxWeight) {
            packables.add(packable);
        }
        else {
            System.out.println("Too heavy, can't add more!");
        }
    }

    public double weight() {
        double sum = 0;
        for (Packable packable : packables) {
            sum += packable.weight();
        }
        return sum;
    }

    @Override
    public String toString() {
        return String.format("Box: %s items, total weight %.1f kg", packables.size(), this.weight());
    }
}
