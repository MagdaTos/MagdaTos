import java.util.Scanner;

public class CustomScanner {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę swoje imię.");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + " !");*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        int result = firstNumber*firstNumber;
        System.out.println("Kwadrat tej liczby " + result);
    }
}
