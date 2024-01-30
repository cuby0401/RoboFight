import java.sql.SQLOutput;

public class EINSbisHUNDERT {
    public static void main(String[] args) {
       /* for (int i = -100; i <= 100; i++) {
            System.out.println(i);
        }
        */
        int height = 5;
       for (int i = 1; i <= height; i++) {
           for (int y = 1; y <= height-i; y++) {
               System.out.print(" ");
           }

           for (int k = 1; k <= 2*i-1; k++) {
               System.out.print("X");
           }
           System.out.println();
       }
        System.out.println("   WwW");
    }
}