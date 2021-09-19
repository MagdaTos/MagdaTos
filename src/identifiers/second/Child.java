package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    //klasa potomna w innej paczce nie ma dostępu do metod private oraz default czyli bez identyfikatora
    public void testIdentifier() {
        System.out.println(first);
        System.out.println(third);
        // do prywatnego dziecko nie ma dostepu
        firstMethod();
        thirdMethod();
    }
}
