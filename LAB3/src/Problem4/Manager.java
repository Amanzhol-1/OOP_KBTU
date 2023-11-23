package Problem4;

import java.util.Vector;
import java.util.Date;
import java.util.Objects;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager() {
        super(); 
        this.team = new Vector<>();
        this.bonus = 0.0;
    }

    public Manager(String name, int age, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, age, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    public void setTeam(Vector<Employee> team) {
        this.team = team;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public int compareTo(Employee other) {
        int baseComparison = super.compareTo(other);
        if (baseComparison != 0) {
            return baseComparison;
        }
        double otherBonus = (other instanceof Manager) ? ((Manager) other).bonus : 0;
        return Double.compare(this.bonus, otherBonus);
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) return false;
        Manager manager = (Manager) object;
        return Double.compare(manager.bonus, bonus) == 0;
    }



    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus=" + bonus + ", teamSize=" + team.size();
    }
 
    @Override
    public Manager clone() {
        Manager cloned = (Manager) super.clone();
        cloned.team = (Vector<Employee>) this.team.clone();
        return cloned;
    }
}

