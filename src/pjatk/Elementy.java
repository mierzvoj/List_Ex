package pjatk;

public class Elementy {
    int id;
    String name;
    boolean isPacked;
    int price;


    public Elementy(int id, String name, boolean isPacked, int price) {
        this.id = id;
        this.name = name;
        this.isPacked = isPacked;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPacked() {
        return isPacked;
    }

    public void setPacked(boolean packed) {
        isPacked = packed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Elementy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isPacked=" + isPacked +
                ", price=" + price +
                '}';
    }
}
