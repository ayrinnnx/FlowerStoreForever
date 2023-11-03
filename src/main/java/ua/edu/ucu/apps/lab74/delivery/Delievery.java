package ua.edu.ucu.apps.lab74.delivery;

import ua.edu.ucu.apps.lab74.flowers.Item;

import java.util.ArrayList;

public interface Delievery {
    String deliver(ArrayList<Item> items);
}