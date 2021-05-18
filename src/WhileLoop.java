public class WhileLoop {
    public static void main(String[] args) {

        int number = 0;

//wykonuje się jesli warunek jest spełniony. Jesli już za pierwszym razem będzie nie spęłniony,
        // to nie wykona się ani raz
        while (number<20){
            System.out.println("Moja wartość to; " + number + " i jestem mniejsza od 20");
            number++;
        }
    }
}
