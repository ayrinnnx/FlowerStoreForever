package ua.edu.ucu.apps.lab74.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
@Entity
public class Flower {
    @Id
    private int id;
    private double price;
    private double sepalLength;
    private FlowerColor color;
    
}
