import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Wie viele Personen wollen spielen?");

        int playerCount = scan.nextInt();

        for(int i = 0; i != playerCount; i++) { //arbeite mit break
            int player = 0;
            //System.out.println(playerCount); //jeder Spieler darf seinen Move ausführen
            player 
        }

        /*double age = 15.3;
        String name = "Sebi ";

        System.out.println("Hallo ich bin " + name + "und bin " + age + " Jahre alt.");
        age = 13;
        System.out.println("Hallo ich bin " + name + "und bin " + age + " Jahre alt.");
        age += 7;
        System.out.println("Hallo ich bin " + name + "und bin " + age + " Jahre alt.");

        boolean isOverEighteen = age >= 18 && name.equals("Sebi ");

        System.out.println("Ist über 18: " + isOverEighteen);

        if(isOverEighteen) {
            System.out.println("HAHHAHA Test");
        }
         */
    }
}