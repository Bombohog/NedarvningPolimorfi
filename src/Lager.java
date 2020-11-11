/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 11-11-2020
 *
 * Description of program
 ********************************************/

import java.util.ArrayList;

public class Lager {

    ArrayList<Varer> vareLager = new ArrayList<>();

    public void fyldOp() {

        for (int i = 0; i < 10; i++) {
            vareLager.add(new Apple());
        }

        for (int i = 0; i < 10; i++) {
            vareLager.add(new Carrot());
        }

        for (int i = 0; i < 5; i++) {
            vareLager.add(new Banana());
        }

        for (int i = 0; i < 5; i++) {
            vareLager.add(new Flower());
        }

    }

    public int antalVarer() { return vareLager.size(); }

    public void visVarer() {

        for (Varer nuværendeVarer : vareLager) {
            System.out.println(nuværendeVarer);
        }

    }

    public int antalÆbler() {

        int antal = 0;
        for (Varer nuværendeVarer : vareLager) {
            if (nuværendeVarer.getClass() == (new Apple().getClass())) { antal++; }
        }

        return antal;
    }

    public int antalObjekter(Varer vare) {

        int antal = 0;
        for (Varer nuværendeVarer : vareLager) {
            if (nuværendeVarer.getClass() == (vare.getClass())) { antal++; }
        }

        return antal;
    }

}
