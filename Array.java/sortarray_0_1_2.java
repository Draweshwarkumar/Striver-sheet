public class sortarray_0_1_2 {
    public static void sortarray_0_1_2(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 2, 1, 2, 0, 2, 0, 1, 0, 0 };
        sortarray_0_1_2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
