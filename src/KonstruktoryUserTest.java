public class KonstruktoryUserTest {
    public static void main(String[] args) {
        // KontruktoryUser user = new KontruktoryUser();
        KontruktoryUser user = new KontruktoryUser("Magda", "hello");
/*        user.username = "Bartek";
        user.password = "QWERTY";*/
        System.out.println(user.username);
        System.out.println(user.password);

        user.sayHello();



    }
}
