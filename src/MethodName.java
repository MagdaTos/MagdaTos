public class MethodName {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

// dodawanie paru metod o tej samej nazwie (muszą być inne parametry), to method overloading

    public void add(int a) {
        System.out.println(a);
    }

    public void add(String a){
        System.out.println(a);
    }
    public void add() {
        System.out.println(2+1);
    }
}