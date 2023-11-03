package ua.edu.ucu.apps.lab74;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ua.edu.ucu.apps.lab74.flowers.Flower;
import ua.edu.ucu.apps.lab74.flowers.FlowerColor;
import ua.edu.ucu.apps.lab74.flowers.FlowerPack;
import ua.edu.ucu.apps.lab74.flowers.FlowerType;
import ua.edu.ucu.apps.lab74.flowers.Gift;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GiftTests {

    @Test
    public void gifting(){
        Flower romashka = new Flower(1, 100, 0.8, FlowerColor.BLUE, FlowerType.ROMASHKA);
        FlowerPack gift = new FlowerPack(romashka , 15);
        
        Gift decGift = new Gift(gift);
        //before decorator
        assertEquals(1500, gift.getPrice());
        //after decorator
        assertEquals(1550, decGift.getPrice());

        gift.setQuantity(55);
        Gift decGift2 = new Gift(gift);

        //before decorator
        assertEquals(5500, gift.getPrice());
        //after decorator
        assertEquals(5550, decGift2.getPrice());

    }
}