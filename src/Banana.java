/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 09-11-2020
 *
 * Description of program
 ********************************************/

public class Banana extends Frugt implements Konsever {

    boolean moden = true;

    @Override
    public void konsever() {
        System.out.println("Bananen tørres");
    }

}
