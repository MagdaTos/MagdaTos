public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "university");
        teacher.walk();
        teacher.eat();
        teacher.teachMatch();
        teacher.sayHello();

        Footballer footballer = new Footballer("Mike", 21, "Barca Juniors");

        footballer.eat();
        footballer.playFootball();
    }
}
