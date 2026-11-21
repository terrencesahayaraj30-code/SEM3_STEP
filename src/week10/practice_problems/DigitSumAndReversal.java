public class DigitSumAndReversal {
    public static void processNumber(int num) {
        int sum = 0, reversed = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + reversed);
    }

    public static void main(String[] args) {
        processNumber(4721);
    }
}
