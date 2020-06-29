import java.util.Scanner;
public class Names {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Podaj imiona: ");

        for (int i = 0; i < names.length; i++) {
            names[i] = scan.nextLine();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.println("Cześć " + names[i]);
        }
    }
}
