import java.util.ArrayList;
import java.util.List;

// Time Complexity: Best case O(n), Worst case O(n^2)
class Student {
    private String name;
    private int m1, m2, m3;

    Student(String name) { this.name = name; }

    public boolean setMarks(int a, int b, int c) {
        if (a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100) return false;
        this.m1 = a; this.m2 = b; this.m3 = c;
        return true;
    }

    public int getTotal() { return m1 + m2 + m3; }
    public double getAverage() { return getTotal() / 3.0; }

    public char getGrade() {
        double avg = getAverage();
        if (avg >= 80) return 'A';
        if (avg >= 70) return 'B';
        if (avg >= 60) return 'C';
        if (avg >= 40) return 'D';
        return 'F';
    }

    @Override
    public String toString() {
        return String.format("%s total = %d avg = %.2f grade = %c", name, getTotal(), getAverage(), getGrade());
    }
}

public class ClassReportCard {
    public static void main(String[] args) {
        Object[][] raw = {
            {"Asha", 80, 90, 70},
            {"Ravi", 60, 65, 70},
            {"Neha", 95, 85, 105},
            {"Kiran", 45, 50, 40},
            {"Pooja", 88, 72, 81}
        };

        List<Student> valid = new ArrayList<>();
        for (Object[] row : raw) {
            Student s = new Student((String) row[0]);
            if (s.setMarks((int) row[1], (int) row[2], (int) row[3])) valid.add(s);
            else System.out.println(row[0] + " skipped: marks must be 0 to 100");
        }

        int passes = 0;
        for (int i = 0; i < valid.size() - 1; i++) {
            boolean swapped = false;
            passes++;
            for (int j = 0; j < valid.size() - 1 - i; j++) {
                if (valid.get(j).getTotal() < valid.get(j + 1).getTotal()) {
                    Student tmp = valid.get(j);
                    valid.set(j, valid.get(j + 1));
                    valid.set(j + 1, tmp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        for (int i = 0; i < valid.size(); i++) {
            System.out.println((i + 1) + ". " + valid.get(i));
        }
        System.out.println("Sorted in " + passes + " passes");
    }
}
