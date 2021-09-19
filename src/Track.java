public class Track implements  Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("Jade ciężarówką z prędkościa: " + speed);

    }

    @Override
    public void stop() {
        System.out.println("Hamuje ciężarówką! ");

    }

    @Override
    public String info() {
        return "ciężarówka";
    }
}
