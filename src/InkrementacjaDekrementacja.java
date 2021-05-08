public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        //Inkrementacja zwiększenie wartości o jeden

        int a =0;
        System.out.println("Wartość a: " + a); //0
        int b = a++; //postinkrementacja
        System.out.println("Wartość b: " +b); // najpierw zwrócenie wyniku 0
        System.out.println("Wartośc a: " +a); //wzrośnie o 1, =1
        int c = ++a; //preinkrementacja
        System.out.println("Wartość c: " +c); // 2
        System.out.println("Watość a: " +a); //2 (1+1

        // dekrementacja zmniejszenie o jeden

        int d = 0;
        System.out.println("Wartość d: " +d); //0
        int e = d--;
        System.out.println("Wartość e: " +e); //0 (Najpierw przypisujemy wartość)
        System.out.println("Wartość d: " +d); //-1 (Potem zmniejszamy o 1)
        int f = --d;
        System.out.println("Wartośc f: " + f); //-2
        System.out.println("Wartość d: " +d); //-2
    }
}
