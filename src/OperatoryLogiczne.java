// działają na wartościach logicznych zwracając również wartości logiczne
public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && -> operator "i" true wtedy gdy obydwa wyrażnie równe sa true
        // || lub -> true gdy jedno wyrażnie składowe jest równe true
        // ! negacja - zwraca wartośc przeciwną do wyrażenia przez ktorym się znajduje

        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); // true
        System.out.println(firstValue || secondValue); // true
        System.out.println(secondValue || fourthValue); // true
        System.out.println(secondValue || thirdValue); // false
        System.out.println(!firstValue); // false
        System.out.println(!secondValue); //true
        System.out.println(!(firstValue && secondValue)); // true ( bo z tego wewnętrzego wyrazenia mielismu false
    }
}
