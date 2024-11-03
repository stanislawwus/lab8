package ua.ucu.edu.apps.FlowerStoreContinue.delivery;

import ua.ucu.edu.apps.FlowerStoreContinue.store.items.Item;

import java.util.List;

public interface Delivery {
    double deliver(List<Item> items);
}
