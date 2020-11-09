import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Apple extends Frugt implements Konsever {

    String sort = "Golden Delicious";
    String type = "spiseæble";
    boolean moden = false;


    @Override
    public void konsever() {
        System.out.println("Æblerne bliver lavet til æblemos");
    }

}
