// instrukcje warunkowe pozwalają nam określać, które częsci kodu mają zostać wykonane, gdy zostanie spełniony
// warunek
public class InstrucjeWarunkoweIfAndElse {

    public static void main(String[] args) {
        float a =10;
        float b = 12;
        if(b!=0) {
            System.out.println("Wynik dzielenia to: " + (a/b));
        }

        float dzielna =4.0F;
        float dzielnik = 0;
        if(dzielnik !=0) {
            System.out.println("Wynik drugiego dzielenia to: " + dzielna/dzielnik);
        } else {
            System.out.println("Proszę podaj inną liczbę"); // wyświetli się jesli dzielnik będzie równy 0
        }

    }}
