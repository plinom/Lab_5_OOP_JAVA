package maxondev;

public class FlowerPack {
    private final Flower flower;
    public final int quantity;
    FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
    double getPrice() {
        return this.flower.getPrice() * quantity;
    }
    public boolean equals(Object flowerPack) {
        if(flowerPack == null) { return false; }
        if(!(flowerPack instanceof FlowerPack)) { return false; }
        return quantity == ((FlowerPack) flowerPack).quantity && ((FlowerPack) flowerPack).flower.equals(flower);
    }
}
