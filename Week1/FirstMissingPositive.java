package Week1;

public class FirstMissingPositive {
    public static int firstMissing(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] >= 1 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                int k = nums[i] - 1;
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return nums.length + 1;

    }

    public static void main(String args[]) {
        int[] nums = { 3, 4, -1, 1 };
        System.out.println(firstMissing(nums));
    }
}
