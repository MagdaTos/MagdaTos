import java.util.Scanner;
//main też jest metodą statyczną
public class StudentChecker {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni; // pole statyczne
        Student.infoUczelnia(); //metoda statyczna

        Student adam = new Student();
        adam.imię = "Adam";
        adam.nazwisko = "Adamski";
        adam.numerIndeksu = 21321;
        adam.email = "adamadam@gmail.com";
        adam.nick = "Adaam";
        adam.infoUczelnia();

        String uczelniaAdama = adam.nazwaUczelni;

        Student kasia = new Student();
        kasia.imię = "Kasia";
        kasia.nazwisko = "Adamska";
        kasia.numerIndeksu = 21325;
        kasia.email = "kasiadam@gmail.com";
        kasia.nick = "Kaks";

        Student piotr = new Student();
        piotr.imię = "Piotr";
        piotr.nazwisko = "Piotrowski";
        piotr.numerIndeksu = 21327;
        piotr.email = "piotrpiotrowski@gmail.com";
        piotr.nick = "Piro";

        Student[] students = new Student[3]; //są 3 elementy tablicy
        students[0] = adam;  // numerujemy od 0
        students[1] = kasia;
        students[2] = piotr;

        for (int i = 0; i < students.length; i++) {
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].przedstawSie();
            students[i].zalogujSie();
        }

        String imie = "kasia";
        imie.strip();
        Scanner scanner = new Scanner(System.in);






    }
}
