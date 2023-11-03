package ua.edu.ucu.apps.lab74.flowers;

public class Gift extends AbstractDecorator{
    private FlowerPack flowerPack;

    public Gift(FlowerPack flowerPack) {
        super(flowerPack.getFlower(), flowerPack.getQuantity());
        this.flowerPack = flowerPack;
    }

    @Override
    public double getPrice() {
        return flowerPack.getPrice() + 50;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }


    public String toString(){
        return "To gift you also bought a beautiful packaging";
    }
    
}
