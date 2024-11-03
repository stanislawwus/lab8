package ua.ucu.edu.apps.FlowerStoreContinue.delivery;

import org.junit.jupiter.api.Test;
import ua.ucu.edu.apps.FlowerStoreContinue.store.items.Item;
import ua.ucu.edu.apps.FlowerStoreContinue.store.items.flowers.Flower;
import ua.ucu.edu.apps.FlowerStoreContinue.store.items.properties.FlowerColor;
import ua.ucu.edu.apps.FlowerStoreContinue.store.items.properties.FlowerType;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.ArrayList;

public class DeliveryTest {

    @Test
    public void testDHLDeliveryStrategyWithItems() {
        DHLDeliveryStrategy dhlStrategy = new DHLDeliveryStrategy();
        List<Item> items = new ArrayList<>();
        items.add(new Flower(FlowerColor.WHITE, FlowerType.ROMASHKA,
                25.0, 1000.0));
        items.add(new Flower(FlowerColor.GREEN, FlowerType.CACTUS,
                25.0, 1500.0));

        double cost = dhlStrategy.deliver(items);

        assertEquals(250.0, cost, 0.01);
    }

    @Test
    public void testDHLDeliveryStrategyWithEmptyList() {
        DHLDeliveryStrategy dhlStrategy = new DHLDeliveryStrategy();
        List<Item> items = new ArrayList<>();

        double cost = dhlStrategy.deliver(items);

        assertEquals(0.0, cost, 0.01);
    }

    @Test
    public void testPostDeliveryStrategyWithItems() {
        PostDeliveryStrategy postStrategy = new PostDeliveryStrategy();
        List<Item> items = new ArrayList<>();
        items.add(new Flower(FlowerColor.WHITE, FlowerType.ROMASHKA,
                25.0, 1000.0));
        items.add(new Flower(FlowerColor.GREEN, FlowerType.CACTUS,
                25.0, 1500.0));

        double cost = postStrategy.deliver(items);

        assertEquals(125.0, cost, 0.01);
    }

    @Test
    public void testPostDeliveryStrategyWithEmptyList() {
        PostDeliveryStrategy postStrategy = new PostDeliveryStrategy();
        List<Item> items = new ArrayList<>();

        double cost = postStrategy.deliver(items);

        assertEquals(0.0, cost, 0.01);
    }
}
