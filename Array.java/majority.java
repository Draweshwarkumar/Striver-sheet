public class majority {
    public static int majority(int arr[]) {
        int count = 0;
        int ele = -1;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                ele = arr[i];
            } else if (ele == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                count1++;
            }
            if (count1 > (arr.length / 2)) {
                return ele;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majority(arr);
        System.out.println(ans);
    }
}
