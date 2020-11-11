import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Varer {

    double stykpris;
    Date holdbarhed;
    boolean kanSælges = true;

    void smidUd() {
        kanSælges = false;
    }

    @Override
    public String toString() {
        return getClass().getName();
    }

}
