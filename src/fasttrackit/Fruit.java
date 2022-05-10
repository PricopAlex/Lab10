package fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
    private String name;
    private int quantity;

    public static void main(String[] args) {
        List<Fruit> fruits=new ArrayList<>();
        fruits.add(new Fruit("banana",1));
        System.out.println(fruits);
    }


public Fruit(String name, int quantity){
    this.name=name;
    this.quantity=quantity;

}

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return "Fruit{" +
                "nume='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
