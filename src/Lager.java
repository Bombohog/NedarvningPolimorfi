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

    public void fyldOp(int antalApples, int antalCarrots, int antalBanana, int antalFlowers) {

        for (int i = 0; i < antalApples; i++) {
            vareLager.add(new Apple());
        }

        for (int i = 0; i < antalCarrots; i++) {
            vareLager.add(new Carrot());
        }

        for (int i = 0; i < antalBanana; i++) {
            vareLager.add(new Banana());
        }

        for (int i = 0; i < antalFlowers; i++) {
            vareLager.add(new Flower());
        }

    }

    public int antalVarer() { return vareLager.size(); }

    public void visVarer() {

        for (Varer nuværendeVare : vareLager) {
            System.out.println(nuværendeVare);
        }

    }

    public int antalÆbler() {

        int antal = 0;
        for (Varer nuværendeVare : vareLager) {
            if (nuværendeVare instanceof Apple) { antal++; }
        }

        return antal;
    }

    public int antalObjekter(Varer vare) {

        int antal = 0;
        for (Varer nuværendeVare : vareLager) {
            if (nuværendeVare.getClass() == vare.getClass()) { antal++; }
        }

        /*  // det samme bare med for-i
        for (int i = 0; i < vareLager.size(); i++) {
            if (vareLager.get(i).getClass() == vare.getClass()) { antal++; }
        }*/

        return antal;
    }

}
