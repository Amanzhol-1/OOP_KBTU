package Problem4;

import java.util.Collections;
import java.util.Vector;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 28, 30000.0, new Date(2023, 1, 1), "INS123456");
        Employee emp2 = new Employee("Bob", 32, 40000.0, new Date(2022, 6, 15), "INS654321");
        Employee emp3 = new Employee("Charlie", 25, 35000.0, new Date(2023, 3, 20), "INS987654");

        Manager mgr = new Manager("Amanzhol", 19, 50000.0, new Date(2021, 12, 5), "MGRINS0001", 5000.0);

        mgr.getTeam().add(emp1);
        mgr.getTeam().add(emp2);
        mgr.getTeam().add(emp3);
 
        Vector<Employee> staff = new Vector<>();
        staff.add(emp1);
        staff.add(emp2);
        staff.add(emp3);
        staff.add(mgr);

        Collections.sort(staff, new NameComparator());
        System.out.println("Sorted by name:");
        for (Employee emp : staff) {
            System.out.println(emp);
        }


        Collections.sort(staff, new HireDateComparator());
        System.out.println("\nSorted by hire date:");
        for (Employee emp : staff) {
            System.out.println(emp);
        }
        

        Manager mgrClone = mgr.clone();
        System.out.println("\nManager cloned:");
        System.out.println("Original Manager: " + mgr);
        System.out.println("Cloned Manager: " + mgrClone);

        mgrClone.setBonus(10000.0);
        mgrClone.getTeam().clear();

        System.out.println("\nComparing manager to its clone after modifications:");
        System.out.println("Original Manager: " + mgr);
        System.out.println("Cloned Manager: " + mgrClone);

        System.out.println("Are they still equal? " + mgr.equals(mgrClone));
    }
}

