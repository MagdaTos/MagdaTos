public class Student {
    public String imię;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    // ta ponizej to metoda statyczna, mozna ją wywołać odwołując się do niej do pol statycznych - static
    public static String nazwaUczelni = "AGH po zmianie"; // pole statyczne

    // poniżej metody są charakterystyczne na obiektów danej klasy
    public void przedstawSie() { System.out.println("Nazywam się: " + imię + " " + nazwisko); }

    public void zalogujSie() { System.out.println("Loguję się za pomocą: " + nick); }

    public void podajNrIndeksu() {
        System.out.println("Mój nr indeksu to: " + numerIndeksu);
    }

    public void podajEmail() {
        System.out.println("Mój email to: " + email);
    }

    public static void infoUczelnia() {
        System.out.println("Moja uczenia to " + nazwaUczelni);
        druga();
    }
    public static void druga() {
        System.out.println("Jestem drugą metodą");
    }

}
