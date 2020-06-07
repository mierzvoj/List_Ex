package pjatk;
import java.util.*;

public class LoadElements {

    Elementy elementy;
    Service service;




    public LoadElements() {
        this.elementy = elementy;
        this.service = service;

    }


    Service srv1 = new Service();

    public void loadingEl(){
        srv1.addToList(1, "el1", true, 1 );
        srv1.addToList(2, "el2", true, 10 );
        srv1.addToList(3, "el3", true, 20);
        srv1.addToList(4, "el4", true, 30);
        srv1.addToList(5, "el5", true, 40);


    }



}
