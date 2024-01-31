//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double age = 15.3;
        String Name = "Bananiklo ";

        System.out.println("Hallo ich bin " + Name + "und bin " + age + " Jahre alt.");

        age = 17.2333;

        System.out.println("Hallo ich bin " + Name + "und bin " + age + " Jahre alt.");

        age += 3;
        System.out.println(age);

        boolean isOverEighteen = age >= 18 && Name.equals("Bananiklo ");
        System.out.println("ist über achtzehn: "+isOverEighteen);

        if (isOverEighteen){
            System.out.println("test");
        }
    }
}


