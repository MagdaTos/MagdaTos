//umożliwiaja wykonanie podstawowych operacji metematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber =4.0F;

        int addition = firstNumber + secondNumber; //10
        int subtraction = firstNumber - secondNumber; //-2
        int multiplication = firstNumber * secondNumber; //24
        float division = thirdNumber / secondNumber;  //0,66
        int mod = secondNumber % firstNumber;  // reszta z dzielenia - 2

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Mnożenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
        System.out.println("Modulo: " + mod);

        firstNumber+=secondNumber; // firstNumber + secondNumber
        System.out.println("Po dodaniu: " + firstNumber); // 10
        firstNumber-=secondNumber; //firstNumber - secondNumber
        System.out.println("Po odejmowaniu: " + firstNumber); // To jest nadpisywanie czyli od 10 - 6 =4
        firstNumber*=secondNumber; //firstNumber * secondNumber
        System.out.println("Po mnożeniu: " + firstNumber); //4 razy 6 = 24
        firstNumber/=secondNumber; // firstNumber / secondNumber
        System.out.println("Po dzieleniu: " + firstNumber); //24/6=4
        firstNumber%=secondNumber; // firstNumber % z dzielenia przez secondNumbet
        System.out.println("PO modulo: "+ firstNumber); //4/6=0 zostaje 4

    }
}