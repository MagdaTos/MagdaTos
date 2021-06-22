public class AutoTest {
    public static void main(String[] args) {
        Auto mercedes = new Auto("Mercedes", "Klasa S", 2021, 1000);  // dodaje nowego obiektu klasy auto, przypisany do zmiennej mercedes

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2020;
        audi.przebieg = 0;

        audi.jedz();
        audi.hamuj();
        audi.info();




    }

}
