import java.util.HashSet;
import java.util.Set;

// Time Complexity: O(n) average using HashSet
// Space Complexity: O(n)
public class TransactionDuplicateCheck {
    public static boolean hasDuplicate(String[] transactionIds) {
        Set<String> seen = new HashSet<>();
        for (String id : transactionIds) {
            if (!seen.add(id)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicate(new String[]{"TXN1001", "TXN1002", "TXN1003", "TXN1002", "TXN1004"})); // true
        System.out.println(hasDuplicate(new String[]{"TXN2001", "TXN2002", "TXN2003"})); // false
    }
}
