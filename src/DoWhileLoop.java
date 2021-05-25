public class DoWhileLoop {
    public static void main(String[] args) {
        //najpierw odbywa sie wykonanie kodu, a dopiero potem sprawdzenie warunku. Pętła wykona się
        // chociaż raz
        int number = 21;
        do {
            System.out.println("Moja wartość to: " + number + " i jestem mniejszy od 20");
            number++;
        } while (number <20);
    }
}
