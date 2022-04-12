// blok, który zawiera jakieś instrukcje
// metoda moze być uruchomiona (wywołana) poprzez odwołanie się do jej nazwy()
// public, private - nazwa to identyfikator dostępu
// void - oznacza, że nasza metoda nie zwraca zadnej wartosci
public class Metods {
    public void policzWynik() {
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;

        }
        System.out.println("Rezultat to: " + result);
    }

    public int pobierzWynik() {
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;

        }
        System.out.println("Rezultat to: " + result);
        return result;
    }

    public void policzWynikParam(int number) {  //podawanie liczby
        System.out.println("Number ma wartość " + number);
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);

    }



    public int add(int firstNumber, int secondNumber, String word) {
        System.out.println("Suma to: " + (firstNumber + secondNumber + word) );

        if(firstNumber ==0) {
            return 0; // gdy mamy if, trzeba dac tez "return" poza if, gdy return byłby równy false
        }
        return firstNumber + secondNumber;

    }
}
