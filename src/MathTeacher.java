public class MathTeacher extends Person{ // nas nauczyciel matematyki rozszerza klasę Person - dziedziczenie
    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze mathteacher");
        this.school = school;
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("I walk very fast");

    }

    public  void teachMatch() {

        System.out.println("I'm teaching Match");
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I'm " + age);
    }
}
