package person;

public class Person {
    /* The Person's name */
    private String name;
    /* The Person's age */
    private int age;
    /* The Person's height */
    private double height;
    /* The Person's sex, that can be "M" or "W" */
    private char sex;
    /* Sets if person its married or not */
    private boolean married;

    // Constructors

    /*
     * Constructor By default
     */
    public Person() {
        this.married = true;
    }

    /*
     * Constructor
     *
     * @param name the person's name
     */

    public Person(String name) {
        this.name = name;
    }

    /*
     * Constructors
     *
     * @param name the person's name
     * @param age the person's age
     * @param height the person's height
     * @param sex the person's sex. It can be "M" (Man) or "W" (Women)
     * @param married true if the person is married, false if not
     */
    public Person(String name, int age, double height, char sex, boolean married) {
        this.name = name;
        this.setAge(age);
        this.height = height;
        this.sex = sex;
        this.married = married;
    }

    // Getters

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public char getSex() {
        return this.sex;
    }

    public boolean isMarried() {
        return this.married;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age must be a positive number.");
        }
    }

    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            System.out.println("Height must be a positive number.");
        }
    }

    public void setSex(char sex) {
        if (sex == 'M' || sex == 'W') {
            this.sex = sex;
        } else {
            System.out.println("Sex must be 'M' (Man) or 'W' (Women).");
        }
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}