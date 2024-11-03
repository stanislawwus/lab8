package ua.ucu.edu.apps.FlowerStoreContinue.store.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.ucu.edu.apps.FlowerStoreContinue.store.items.flowers.Flower;
import ua.ucu.edu.apps.FlowerStoreContinue.store.items.properties.FlowerType;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class FlowerPack extends Item {
    private Flower flower;
    private int count;

    private double getPrice() {
        return flower.getPrice() * count;
    }

    public FlowerType getPackFlowerType() {
        return flower.getType();
    }

    @Override
    public double price() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "FlowerPack{" +
                "count=" + count +
                ", flower=" + flower.getDescription() +
                '}';
    }

    @Override
    public String getDescription() {
        return toString();
    }
}
