public class MetodsTest {
    public static void main(String[] args) {
        Metods metody = new Metods();
      /*  metody.policzWynik();*/
/*        int result = metody.pobierzWynik();
        int result2 = result *2;
        System.out.println("Rezultat przed mnożeniem to: " + result);
        System.out.println("Rezultat po mnożeniu to: " + result2);*/
        metody.policzWynikParam(2);
        metody.policzWynikParam(100);
        metody.policzWynikParam(23);
        metody.policzWynikParam(10);

        metody.add(2,3, "słowo");
        int result =metody.add(3,4, "słowo");
        System.out.println(result);

    }

}
