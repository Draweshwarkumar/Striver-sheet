public class besttimetobuyandsell {
    public static int profit(int arr[]) {
        int mini = arr[0];
        int maxprofit = 0;

        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - mini;
            maxprofit = Math.max(maxprofit, cost);
            mini = Math.min(arr[i], mini);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int ans = profit(arr);
        System.out.println(ans);
    }
}
