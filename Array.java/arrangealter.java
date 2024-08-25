public class arrangealter {

    public static int[] arrangealternatepostnega(int arr[]) {
        int n = arr.length;
        int posindex = 0;
        int[] ans = new int[n];
        int negaindex = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0 && negaindex < n) {
                ans[negaindex] = arr[i];
                negaindex += 2;
            } else if (arr[i] >= 0 && posindex < n) {
                ans[posindex] = arr[i];
                posindex += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -3, -5, -8, -4, 9, 4, 5, 6 };
        int ans[] = arrangealternatepostnega(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
