package ua.ucu.edu.apps.FlowerStoreContinue.store.items.flowers;

import ua.ucu.edu.apps.FlowerStoreContinue.store.items.properties.FlowerType;

public class RomashkaFlower extends Flower {
    public RomashkaFlower(Flower chamomile) {
        super(chamomile);
        this.setType(FlowerType.ROMASHKA);
    }

    public RomashkaFlower() {
        super();
        this.setType(FlowerType.ROMASHKA);
    }

}
