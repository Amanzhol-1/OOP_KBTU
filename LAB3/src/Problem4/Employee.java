package Problem4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee() {
        super();
        this.salary = 0.0;
        this.hireDate = new Date();
        this.insuranceNumber = "undefined";
    }

    public Employee(String name, int age, double salary, Date hireDate, String insuranceNumber) {
        super(name, age);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) return false;
        Employee employee = (Employee) object;
        return Double.compare(employee.salary, salary) == 0 &&
               Objects.equals(hireDate, employee.hireDate) &&
               Objects.equals(insuranceNumber, employee.insuranceNumber);
    }
 


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, hireDate, insuranceNumber);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                '}';
    }
    
    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public Employee clone() {
        try {
            Employee cloned = (Employee) super.clone();
            cloned.hireDate = (Date) this.hireDate.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning failed", e);
        }
    }
}