// Kontruktory specjalne metody, które zwracają obekt danej klasy i które są wywoływane automatycznie
// podczas tworzenia obiektu
// kontruktor domyslny
public class KontruktoryUser {
    public String username;
    public String password;

    public KontruktoryUser() {

    }

    // może być puste w nawiasie() lub może tez przekazywać wartości jak poniżej:
    //this wskazuje na pola nowo tworzonego obiektu

    public KontruktoryUser(String username1, String password2) {
        System.out.println("Hello z kontruktora");
        this.username = username1; //przypisanie wartości
        this.password = password2;


    }

    public void sayHello() {
        System.out.println("Hello my name is: " + username);
    }
}
