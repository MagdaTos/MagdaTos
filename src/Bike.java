public class Bike implements Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("Jade rowerem z predkościa " +speed);

    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem! Naciskam mocno na pedały");

    }

    @Override
    public String info() {
        return "rower";
    }
    public void zatankuj() {
        System.out.println("Aby mieć duzo siły musze zjeśc obiad");
    }
}
