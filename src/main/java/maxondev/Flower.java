package maxondev;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;
    public String getColor() { return color.toString(); }
    public boolean equals(Object flower) {
        if(flower == null) { return false; }
        if(!(flower.getClass().getName().equals(this.getClass().getName()))) { return false; }
        return sepalLength == ((Flower) flower).sepalLength && color == ((Flower) flower).color && price == ((Flower) flower).price;
    }
}
