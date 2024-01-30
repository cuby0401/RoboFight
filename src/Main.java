//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double age = 15.3;
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
    }
}