public class findmissinno {
    public static int findno(int arr[]) {
        int i;
        for (i = 1; i <= arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return i;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 8 };
        int ans = findno(arr);
        System.out.println(ans);
    }
}
