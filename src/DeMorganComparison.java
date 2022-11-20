import java.util.Scanner;

public class DeMorganComparison {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введіть a - true чи false");
        boolean a = scanner.nextBoolean();
        System.out.println("Введіть b - true чи false");
        boolean b = scanner.nextBoolean();
        // Умови застосування теореми Де Моргана.
        if (a | b)
            System.out.println("A | B = " + (a | b));
        else
            System.out.println("A | B = " + (a | b));

        // Умови після застосування теореми Де Моргана.
        if (!(!a & !b))
            System.out.println("!(!A & !B) = " + !(!a & !b));
        else
            System.out.println("!(!A & !B) = " + !(!a & !b));
    }
}
