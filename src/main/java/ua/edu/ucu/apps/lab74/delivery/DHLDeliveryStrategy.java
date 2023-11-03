package ua.edu.ucu.apps.lab74.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import ua.edu.ucu.apps.lab74.flowers.Item;

import java.util.ArrayList;
import java.util.List;

public class DHLDeliveryStrategy implements Delievery {

    @Override
    @GetMapping("/api/delivery/DHL")
    public String deliver(ArrayList<Item> items) {
        return "DHL Delivery";
    }
}