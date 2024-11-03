package ua.ucu.edu.apps.FlowerStoreContinue.store;

import ua.ucu.edu.apps.FlowerStoreContinue.delivery.Delivery;
import ua.ucu.edu.apps.FlowerStoreContinue.payment.Payment;
import ua.ucu.edu.apps.FlowerStoreContinue.store.items.Item;

import java.util.LinkedList;

public class Order {

    LinkedList<Item> items;
    Payment payment;
    Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0.0;
        for (Item item : items) {
            price += item.price();
        }
        return price;
    }

    public boolean processOrder() {;
        payment.pay(calculateTotalPrice() + delivery.deliver(items));
        return true;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(Item item) {
        for (Item currentItem : items) {
            if (currentItem.equals(item)) {
                items.removeFirstOccurrence(item);
                return true;
            }
        }
        return false;
    }
}
