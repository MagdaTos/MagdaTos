public class ConversionCasting {
    public static void main(String[] args) {
        int a = 2;
        double b = 4.23;

        double c = a/b; // a zostaje przekonwertowane na double
        int d = a/(int)b;  //przekonwertowanie double na int/

        System.out.println(c);
        System.out.println(d);

        }

    }

