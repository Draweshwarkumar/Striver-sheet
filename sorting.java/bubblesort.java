public class bubblesort {

    public static int[] bubble(int arr[]){
        int n = arr.length;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[] = {9,14,2,6,15,8};
        int arr1[] = bubble(arr);
        for(int i =0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

    }
    
}
