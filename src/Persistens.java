import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 10/11/2020
 */

public class Persistens {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Velkommen til Grøntorvets lagersystem");
        System.out.println("Indlæser data...");

        Persistens p = new Persistens();
        p.save();
        p.load();
    }

    public void save() {

        // Create a file
        java.io.File file = new java.io.File("data/varer.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Write/save data in file
        try {

            java.io.PrintWriter output = new java.io.PrintWriter(file);

            // Write formatted output to the file
            Lager newLager = new Lager();
            newLager.fyldOp(7, 15, 10, 6);
            output.print("Æbler ");
            output.println(newLager.antalObjekter( new Apple() ));
            output.print("Guleroder ");
            output.println(newLager.antalObjekter( new Carrot() ));
            output.print("Bananer ");
            output.println(newLager.antalObjekter( new Banana() ));
            output.print("Blomster ");
            output.println(newLager.antalObjekter( new Flower() ));

            // Close the file
            output.close();

        } catch (Exception e) { System.out.println("WUPS, filen kan iike skrives, lav en mapper der hedder data/varer.txt"); }


    }

    public void load() throws FileNotFoundException {
        // Create a File instance
        java.io.File file = new java.io.File("data/varer.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read data from a file
        while (input.hasNext()) {
            String vare = input.next();
            int antal = input.nextInt();
            System.out.println(
                    vare + " " + antal);
        }

        // Close the file
        input.close();
    }
}
