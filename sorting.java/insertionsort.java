public class insertionsort {
    public static int[] insertion(int arr[]){
       int n = arr.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[] = {9,14,15,2,6,8};
       int arr1[] =  insertion(arr);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
}
