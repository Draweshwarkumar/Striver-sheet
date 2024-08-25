public class maxsubarraysum {

    public static int maxsum(int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int ansstart = -1;
        int ansend = -1;
        int start = -1;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum = sum + arr[i];
            if (sum > max) {
                max = sum;
                ansstart = start;
                ansend = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("Starting index of maxsubarray is " + ansstart);
        System.out.println("Last index of maxsubarray is " + ansend);
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 8, -2, 8, 49, -45, 5 };
        int ans = maxsum(arr);
        System.out.println(ans);
    }
}
