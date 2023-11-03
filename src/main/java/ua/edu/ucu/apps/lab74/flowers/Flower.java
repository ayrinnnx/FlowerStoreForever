package ua.edu.ucu.apps.lab74.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor @Getter
@Entity
@NoArgsConstructor
public class Flower {
    @Id
    private int id;
    private double price;
    private double sepalLength;
    private FlowerColor color;
    private FlowerType flowerType;

    public Flower(Flower otherFlower) {
        this.price = otherFlower.price;
        this.sepalLength = otherFlower.sepalLength;
        this.color = otherFlower.color;
        this.flowerType = otherFlower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    
}
