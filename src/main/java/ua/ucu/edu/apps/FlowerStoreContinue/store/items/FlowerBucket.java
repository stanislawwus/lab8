package ua.ucu.edu.apps.FlowerStoreContinue.store.items;

import ua.ucu.edu.apps.FlowerStoreContinue.store.items.properties.FlowerType;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item{
    private final List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    private void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public void addFlowers(List<FlowerPack> flowerPacks) {
        for (FlowerPack flowerPack : flowerPacks) {
            add(flowerPack);
        }
    }

    private double getPrice() {
        double price = 0;

        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.price();
        }

        return price;
    }

    private List<FlowerType> getAllFlowerTypes() {
        List<FlowerType> allTypes = new ArrayList<>();
        for (FlowerPack pack : flowerPacks) {
            allTypes.add(pack.getPackFlowerType());
        }
        return allTypes;
    }

    public List<FlowerPack> search(List<FlowerType> types) {
        List<FlowerPack> suitablePacks = new ArrayList<>();
        for (FlowerPack suitablePack : this.flowerPacks) {
            if (types.contains(suitablePack.getPackFlowerType())) {
                suitablePacks.add(suitablePack);
            }
        }
        return suitablePacks;
    }

    @Override
    public double price() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "FlowerBucket{" +
                "flowerPacks=" + flowerPacks.stream()
                .map(FlowerPack::getDescription).reduce((a, b) -> a + "\n" + b + "\n")
                .orElse("") +
                '}';
    }

    @Override
    public String getDescription() {
        return toString();
    }
}
