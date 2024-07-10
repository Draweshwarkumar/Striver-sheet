// package Array.java;

public class secondlargest {
    public static int  Slargest(int arr[]){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1 = arr[i];
            }
            if(arr[i]>max2 && arr[i]<max1){
                max2  = arr[i];
            }
        }
        return max2;
    }
    public static void main (String[] args){
        int arr[] = {45,6,3,7,8,2,67,95};
        int ans = Slargest(arr);
        System.out.println(ans);
    }
    
}
