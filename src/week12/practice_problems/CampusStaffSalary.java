import java.util.Scanner;

// Time Complexity: O(n)
class Staff {
    String name;
    double baseSalary;

    Staff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double getBonus() { return 0.0; }
    String getRole() { return "Staff"; }
}

class Teacher extends Staff {
    Teacher(String name, double baseSalary) { super(name, baseSalary); }
    @Override double getBonus() { return 5000.0; }
    @Override String getRole() { return "Teacher"; }
}

class LabAssistant extends Staff {
    LabAssistant(String name, double baseSalary) { super(name, baseSalary); }
    @Override double getBonus() { return 2000.0; }
    @Override String getRole() { return "LabAssistant"; }
}

public class CampusStaffSalary {
    public static void main(String[] args) {
        Staff[] staffList = {
            new Teacher("Rahul", 30000),
            new LabAssistant("Priya", 20000),
            new Staff("Amit", 25000),
            new Teacher("Sneha", 35000),
            new LabAssistant("Karan", 18000)
        };
        double grandTotal = 0;
        for (Staff s : staffList) {
            double bonus = s.getBonus();
            double total = s.baseSalary + bonus;
            grandTotal += total;
            System.out.printf("%s (%s): base %.1f, bonus %.1f, total %.1f%n", s.name, s.getRole(), s.baseSalary, bonus, total);
        }
        System.out.printf("Grand Total Salary: %.1f%n", grandTotal);
    }
}
