import java.util.Date; // Command used to import Date

/**
 * This is the Employee class that is used to create an Employee object by inheriting name from the Person class
 */
public class Employee extends Person{

    // Private variables for the Employee class
    private Date hireDate;

    // Default Constructor for the Employee Class
    public Employee() {
        super();
        hireDate = new Date();
    }

    // Non-default Constructor for the Employee Class
    public Employee(String name, Date hireDate) {
        super(name);
        if (hireDate == null) {
            System.out.println("Error creating an employee");
            System.exit(0);
        }
        this.hireDate = hireDate;
    }

    // Copy Constructor for the Employee Class
    public Employee(Employee aEmployee) {
        super(aEmployee);
        if (aEmployee == null) {
            System.out.println("Error creating an employee");
            System.exit(0);
        }
        this.hireDate = aEmployee.hireDate;
    }


    // Getters & Setters for the Employee Class
    public Date getHireDate() {return hireDate;}

    public void setHireDate(Date hireDate) {
        if (hireDate == null) {
            System.out.println("Invalid Date");
            System.exit(0);
        }
        this.hireDate = hireDate;
    }

    // ToString method for the Employee class
    public String toString() {
        return " was hired on " + getHireDate();
    }

    /**
     * This is the equals method for the Employee class that is used to compare two Employee objects and returns
     * whether they are equal or not
     * @param aEmployee Employee
     * @return boolean
     */
    public boolean equals(Employee aEmployee) {
        return (super.equals(aEmployee) && getHireDate() == aEmployee.getHireDate());
    }
}
