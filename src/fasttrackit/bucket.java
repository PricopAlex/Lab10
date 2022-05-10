package fasttrackit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bucket {
    private List<Fruit> cumparaturi;

    public bucket() {
        this.cumparaturi = new ArrayList<>();


    }

    public bucket(List<Fruit> takenfruits) {
        List<Fruit> a = new ArrayList<>();
        for (Fruit f : takenfruits) {
            a.add(f);
        }
        this.cumparaturi = new ArrayList<>(takenfruits);

    }

    public boolean find(Fruit a) {
        return this.cumparaturi.contains(a);
    }



        




    public boolean adaugacumparaturi(Fruit o) {
        return cumparaturi.add(o);
    }

    public List<Fruit> getCumparaturi() {
        return new ArrayList<>(this.cumparaturi);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "cumparaturi=" + cumparaturi.toString() +
                '}';
    }

}












