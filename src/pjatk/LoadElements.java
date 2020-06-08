package pjatk;
import java.util.*;

 public class LoadElements {

    Elementy elementy;
    Service service;

    public LoadElements() {
        this.elementy = elementy;
        this.service = service;
    }

    public void setElementy(List<Elementy> elementy1) {
        this.elementy = elementy;
    }

    public void setE2(Elementy e2) {
        this.e2 = e2;
    }

    public void setE3(Elementy e3) {
        this.e3 = e3;
    }

    public void setE4(Elementy e4) {
        this.e4 = e4;
    }

    public void setEl(Elementy el) {
        this.el = el;
    }

    Elementy el = new Elementy(1, "e11", true, 1);
    Elementy e2 = new Elementy(1, "e11", true, 1);
    Elementy e3 = new Elementy(1, "e11", true, 1);
    Elementy e4 = new Elementy(1, "e11", true, 1);


    public void print(){
        System.out.println(elementy);
    }

    @Override
    public String toString() {
        return "LoadElements{" +
                "elementy=" + elementy +
                ", service=" + service +
                ", el=" + el +
                ", e2=" + e2 +
                ", e3=" + e3 +
                ", e4=" + e4 +
                '}';
    }
}



