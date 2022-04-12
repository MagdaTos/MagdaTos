package animals;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Hauu");
        sayHello();
        System.out.println("Number od legs: " + legs);
    }
}
