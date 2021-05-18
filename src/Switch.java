// instrukcja sterująca switch
public class Switch {
    public static void main(String[] args) {
        String danie = "Losos";
                switch (danie) {
                    case "Pizza":
                        System.out.println("Cena to 22zł");
                        break;
                    case "Losos":
                        System.out.println("Cena to 9zł");
                        break;
                    default:
                        System.out.println("Nie mamy takiego dania w karcie");
                }
    }
}
