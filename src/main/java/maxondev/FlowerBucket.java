package maxondev;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private final List<FlowerPack> flowerPacks = new ArrayList<>();
    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
    public double getPrice() {
//        return flowerPacks.stream().mapToDouble(FlowerPack::getPrice).sum();
        double price = 0;
        for(FlowerPack el: flowerPacks) {
            price += el.getPrice();
        }
        return price;
    }
    public boolean equals(Object flowerBucket) {
        if(flowerBucket == null) { return false; }
        if(!(flowerBucket instanceof FlowerBucket)) { return false; }
        return ((FlowerBucket) flowerBucket).flowerPacks.equals(flowerPacks);
    }
}
