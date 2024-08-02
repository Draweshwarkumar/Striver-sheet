// package Array.java;

public class largestelement {
    public static int largestelement(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main (String[] args){
        int arr[] = {45,6,3,7,8,2,67,95};
        int ans = largestelement(arr);
        System.out.println(ans);
    }
    
}
