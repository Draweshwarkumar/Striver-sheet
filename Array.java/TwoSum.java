public class TwoSum {

    public static int[] twosum(int nums[], int target) {
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 4 };
        int target = 6;
        int ans[] = twosum(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

}
