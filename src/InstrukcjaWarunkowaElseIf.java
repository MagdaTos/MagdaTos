public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args) {
        int number = -4;
        if(number > 0) {
            System.out.println("Liczba wieksza od zera");
        } else if (number < -10) {
            System.out.println("Liczba mniejsza od -10");
        } else if ( number == 0) {
            System.out.println("Liczba równa 0");
        } else {
            System.out.println(" Liczba w przedziale 0 do -10");
        }
    }
}
// jesli jakiś warunek zostanie spełniony, to zostanie od wyświetlony i dalsze nie będą sprawdzane.
// np. mielibysmy liczbę 7 i 2 warunki: 1. number>0, 2. number>5. Wyświetli napis na 1. warunku i pójdzie
// do drugiego kodu
