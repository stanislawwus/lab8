package ua.ucu.edu.apps.FlowerStoreContinue.store.items.flowers;

import ua.ucu.edu.apps.FlowerStoreContinue.store.items.properties.FlowerColor;
import ua.ucu.edu.apps.FlowerStoreContinue.store.items.properties.FlowerType;

public class CactusFlower extends Flower {

    public CactusFlower(Flower cactus) {
        super(cactus);
        this.setType(FlowerType.CACTUS);
        this.setColor(FlowerColor.GREEN);
    }

    public CactusFlower() {
        super();
        this.setType(FlowerType.CACTUS);
        this.setColor(FlowerColor.GREEN);
    }

}


