package pjatk;

import java.util.*;

public class Service {

    List<Elementy> elementy1 = new ArrayList<>();

    public List<Elementy> getElementy1() {
        return elementy1;
    }

    public void setElementy1(List<Elementy> elementy1) {
        this.elementy1 = elementy1;
    }

    public List<Elementy> findAll() {
        return this.elementy1;

    }




    public void addToList( int id, String name, boolean isPacked, int price ) {
        Elementy el1 = new Elementy(id, name, isPacked, price);
        elementy1.add(el1);

    }






    public Optional<Elementy> findById(int id) {
        return elementy1.stream().filter(pizza -> pizza.getId() == id).findFirst();
    }

    public void sell(int id, String customer) {
        Optional<Elementy> byId = findById(id);

        if (byId.isPresent()) {
            if (!byId.get().isPacked()) {
                System.out.println("Elementy " + byId.get() + "has been sold to " + customer);
            }


        } else {
            System.out.println("Elementy not found ");
        }
    }

    @Override
    public String toString() {
        return "Service{" +
                "elementy1=" + elementy1 +
                '}';
    }
}
