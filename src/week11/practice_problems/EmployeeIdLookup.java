import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(1) average per getDepartment query after O(n) build
// Space Complexity: O(n)
public class EmployeeIdLookup {
    public static Map<String, String> buildLookup(String[][] records) {
        Map<String, String> lookup = new HashMap<>();
        for (String[] rec : records) {
            lookup.put(rec[0], rec[1]);
        }
        return lookup;
    }

    public static String getDepartment(Map<String, String> lookup, String employeeId) {
        return lookup.getOrDefault(employeeId, "Unknown");
    }

    public static void main(String[] args) {
        String[][] records = {{"E245", "Finance"}, {"E110", "Engineering"}, {"E390", "Marketing"}, {"E101", "Engineering"}};
        Map<String, String> lookup = buildLookup(records);
        System.out.println(getDepartment(lookup, "E390")); // Marketing
        System.out.println(getDepartment(lookup, "E999")); // Unknown
    }
}
