public class WordReverserPalindrome {
    public static void checkWord(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println(reversed);
        if (word.equals(reversed)) System.out.println("palindrome");
        else System.out.println("not a palindrome");
    }

    public static void main(String[] args) {
        checkWord("level");
        checkWord("java");
    }
}
