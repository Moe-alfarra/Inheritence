/**
 * This is the Person class that is used to create a Person object
 */
public class Person {

    // Private variables for the Person class
    private String name;


    // Default Constructor for the Person class
    public Person() {
        name = "no name";
    }

    // Non-default Constructor for the Person class
    public Person(String name) {
        if (name == null) {
            System.out.println("Error creating a person");
            System.exit(0);
        }
        this.name = name;
    }

    // Copy Constructor for the Person class
    public Person(Person aPerson) {
        if (aPerson == null) {
            System.out.println("Error creating a person");
            System.exit(0);
        }
        this.name = aPerson.name;
    }

    // Getters & Setters for the Person class
    public String getName() {return name;}

    public void setName(String name) {
        if (name == null) {
            System.out.println("Invalid Name");
            System.exit(0);
        }
        this.name = name;
    }

    // ToString for the Person class
    public String toString() {
        return "The name is: " + getName();
    }

    /**
     * This is the equals method for the person class that is used to compare two person objects and returns a boolean
     * that shows whether they are equal or not
     * @param aPerson Person
     * @return boolean
     */
    public boolean equals(Person aPerson) {
        return getName().equals(aPerson.getName());
    }
}
