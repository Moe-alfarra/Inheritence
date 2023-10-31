import java.util.Date; // Command used to import Date

/**
 * This is the SalariedEmployee class that is used to create a SalariedEmployee object by inheriting hireDate from the
 * Employee class which inherits name from the Person class
 */
public class SalariedEmployee extends Employee{

    // Private variables for the SalariedEmployee class
    private double salary;

    // Default Constructor for the SalariedEmployee class
    public SalariedEmployee() {
        super();
        salary = 0.0;
    }

    // Non-default Constructor for the SalariedEmployee class
    public SalariedEmployee(String name, Date hireDate, double salary) {
        super(name, hireDate);
        if (salary < 0) {
            System.out.println("Error creating a salaried employee");
            System.exit(0);
        }
        this.salary = salary;
    }

    // Copy Constructor for the SalariedEmployee class
    public SalariedEmployee(SalariedEmployee aSalariedEmployee) {
        super(aSalariedEmployee);
        if (aSalariedEmployee == null) {
            System.out.println("Error creating a salaried employee");
            System.exit(0);
        }
        this.salary = aSalariedEmployee.salary;
    }

    // Getters & Setters for the SalariedEmployee class
    public double getSalary() {return salary;}

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Invalid salary");
            System.exit(0);
        }
        this.salary = salary;
    }

    // ToString method for the SalariedEmployee class
    public String toString() {
        return super.toString() + " at Salary " + getSalary() + ".";
    }

    /**
     * This is the equals method for the SalariedEmployee class that is used to compare two SalariedEmployee objects and
     * determine whether they are equal or not
     * @param salariedEmployee SalariedEmployee
     * @return boolean
     */
    public boolean equals(SalariedEmployee salariedEmployee) {
        return (super.equals(salariedEmployee) && getSalary() == salariedEmployee.getSalary());
    }
}
