import java.util.Scanner;

// porównują elementy równania i zwracają logiczną wartość (true/false)
public class OperatoryPorównania {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;

        boolean result = firstNumber > secondNumber; // true

        System.out.println(result);
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);
        System.out.println(secondNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
        Scanner liczba = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę");
        int firstNumber2 = liczba.nextInt();
        Scanner liczba2 = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę");
        int secondNumber2 = liczba2.nextInt();
        int wynik = firstNumber2 + secondNumber2;
        System.out.println("Wynik dodawania tych dwóch liczb: " + wynik);

    }
}
