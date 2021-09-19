public class FinalTest {
    public static void main(String[] args) {
        //jeśli zmienna jest "final", to znaczy, że nie możemy zmienić wartości, która
        // została przypisana do tej zmiennej
        int x = 2;
        final Person person = new Person("Tim", 26);
        person.age =25;
        // dla obiektu final mozemy przypisać tylko jedna osobę ale możemy edytować jej dane

    }
}
