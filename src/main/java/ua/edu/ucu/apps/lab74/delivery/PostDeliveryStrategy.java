package ua.edu.ucu.apps.lab74.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import ua.edu.ucu.apps.lab74.flowers.Item;

import java.util.ArrayList;

public class PostDeliveryStrategy implements Delievery {

    @Override
    @GetMapping("/api/delivery/POST")
    public String deliver(ArrayList<Item> items) {
        return "Post Delivery";
    }
}