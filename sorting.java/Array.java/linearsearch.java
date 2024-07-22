public class linearsearch {

    public static boolean search(int arr[], int n) {
        boolean ans = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                ans = true;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 45, 65, 56, 98, 38, 92 };
        int n = 38;
        boolean ans = search(arr, n);
        System.out.println(ans);
    }

}
