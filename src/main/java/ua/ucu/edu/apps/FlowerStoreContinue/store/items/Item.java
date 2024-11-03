package ua.ucu.edu.apps.FlowerStoreContinue.store.items;

import lombok.Getter;

@Getter
public abstract class Item {

    private String description;

    public abstract double price();

}
