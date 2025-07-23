import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib eine Zahle ein: ");
        int zahl = scanner.nextInt();
        System.out.println(zahl);
        scanner.close();
    }
}

