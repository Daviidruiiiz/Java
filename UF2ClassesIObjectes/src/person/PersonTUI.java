package person;

/**
 * Creates two instances of Bicycle to test Bicycle class and set one of them to a person.
 */
public class PersonTUI {

    /**
     * Main method.
     * 
     * @param args Not used
     */
    public static void main(String[] args) {
        Person p1 = new Person("Eli", 27, 1.60, 'W', false);
        Person p2 = new Person("Alex", 20, 1.74, 'M', false);
        printPerson(p1);
        printPerson(p2);

        p1.birthday();
        printPerson(p1);

        p2.birthday();
        printPerson(p2);

        Person girl = p1;
        Person boy = p2;

        girl.birthday();
        printPerson(p1);

        boy.birthday();
        printPerson(p2);

    }

    /**
     * Prints a textual representation of a person.
     * 
     * @param p a person
     */
    public static void printPerson(Person p) {
        System.out.println("Nom:    " + p.getName());
        System.out.println("Edat:   " + p.getAge());
        System.out.println("Alçada: " + p.getHeight());
        System.out.println("Sexe:   " + p.getSex());
        System.out.println("Casat:  " + p.isMarried());
        System.out.println();
    }

}