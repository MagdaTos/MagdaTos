package identifiers.second;

import identifiers.first.Parent;

public class Random {
    public void testIdentifier() {
        // klasa w tej samej paczce nie ma dostępu do pól/metod private oraz default czyli bez
        //identyfikatora oraz protected
        Parent parent = new Parent();

        System.out.println(parent.first);

        parent.firstMethod();

    }
}
