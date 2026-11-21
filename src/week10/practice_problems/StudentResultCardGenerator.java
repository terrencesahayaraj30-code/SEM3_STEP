class ResultStudent {
    String name;
    int[] marks;

    ResultStudent(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double calculateAverage() {
        int sum = 0;
        for (int m : marks) sum += m;
        return (double) sum / marks.length;
    }

    char assignGrade(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }

    void printResultCard() {
        double avg = calculateAverage();
        System.out.printf("%s: Average %.1f, Grade %c%n", name.toUpperCase(), avg, assignGrade(avg));
    }
}

public class StudentResultCardGenerator {
    public static void main(String[] args) {
        ResultStudent s1 = new ResultStudent("Asha", new int[]{80, 90, 70});
        ResultStudent s2 = new ResultStudent("Ravi", new int[]{60, 55, 50});
        s1.printResultCard();
        s2.printResultCard();
    }
}
