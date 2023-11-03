package ua.edu.ucu.apps.lab74.flowers;

public class Gift extends AbstractDecorator{
    private Item item;

    public Gift(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 50;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }

    public String toString(){
        return "To gift you also bought a beautiful packaging";
    }
    
}
