import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();
        int addition = calculator.add(firstNumber, secondNumber);
        int subtraction = calculator.sub(firstNumber, secondNumber);
        int multiplication = calculator.multi(firstNumber, secondNumber);
        int division = calculator.div(firstNumber, secondNumber);
        int modulation = calculator.mod(firstNumber, secondNumber);

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Mnożenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
        System.out.println("Modulo: " + modulation);

        // mozna tez tak
        //  System.out.println("Dodawanie: " + calculator.add(firstNumber, secondNumber));


    }
}
