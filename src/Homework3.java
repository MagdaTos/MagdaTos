public class Homework3 {
    public static void main(String[] args) {
        // wypisz liczby z zakresu 1-100 podzielne przez 3
        //x%3 = 0
        for (int i=1; i<=100; i++){
            if(i%3==0)
                System.out.println("Jestem podzielna przez 3 : " + i);
        }

        //odwrócić elementy tablicy [1,2,5] -> [5,2,1]

        int[] numbers = new int[] {1,3,5,7,0};

        for(int i=0; i<(numbers.length/2); i++) {
            int temp = numbers[i]; // dla i=0 to 1, dla i=1  3
            numbers[i] = numbers[numbers.length-1-i]; // indeksem z nr 4 -> jest 0  3=>7 //nadpisanie pierwszego elementu ostatnim elementem
            numbers[numbers.length-1-i] = temp; //1 // numbers[3] = 3
            System.out.println(" Iteracja nr " +1);
        }

        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
