// Time Complexity: O(n)
// Space Complexity: O(1) in-place
public class RemoveDuplicatesSortedInPlace {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int writeIdx = 1;
        for (int readIdx = 1; readIdx < nums.length; readIdx++) {
            if (nums[readIdx] != nums[readIdx - 1]) {
                nums[writeIdx++] = nums[readIdx];
            }
        }
        return writeIdx;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int len = removeDuplicates(nums);
        System.out.println("length = " + len);
    }
}
