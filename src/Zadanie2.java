import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj swój wiek");
        int wiek = scanner.nextInt();
        if (wiek >= 18) {
            System.out.println("Możesz kupić alkohol");
        } else if (wiek < 0) {
            System.out.println(" To nieprawidłowa liczba");
        } else {
            System.out.println("Spadaka! Nie kupisz alkoholu gnoju");
        }
    }
}
