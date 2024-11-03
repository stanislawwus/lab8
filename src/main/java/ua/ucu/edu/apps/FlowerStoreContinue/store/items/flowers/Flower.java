package ua.ucu.edu.apps.FlowerStoreContinue.store.items.flowers;

import lombok.*;
import ua.ucu.edu.apps.FlowerStoreContinue.store.items.properties.FlowerColor;
import ua.ucu.edu.apps.FlowerStoreContinue.store.items.properties.FlowerType;
import ua.ucu.edu.apps.FlowerStoreContinue.store.items.Item;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@ToString
public class Flower extends Item {
    private FlowerColor color;
    private FlowerType type;
    private double sepalLength;
    private double price;

    public Flower(Flower flower) {
        this.color = flower.color;
        this.type = flower.type;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }

    public String getColor() {
        return color.getCode();
    }

    @Override
    public double price() {
        return getPrice();
    }

    @Override
    public String getDescription() {
        return toString();
    }
}
