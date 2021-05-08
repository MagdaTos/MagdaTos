import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę");
        int firstNumber = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Proszę podaj drugą liczbę");
        int secondNumber = scanner2.nextInt();
        int result1 = firstNumber*secondNumber;
        int result2 = firstNumber/secondNumber;
        System.out.println("Wynik mnożenia dwóch podanych liczb= " + result1);
        System.out.println("Pierwsza liczba/druga liczba= " + result2);
    }
}
