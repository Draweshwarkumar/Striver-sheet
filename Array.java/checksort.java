// package Array.java;

public class checksort {
    public static boolean check(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if(arr[arr.length-1]>arr[0]){
            count++;
        }
        if(count<=1){
            return true;
        }
        else{
            return false;
        }
    
    }

    public static void main (String[] args){
        int arr[] = {45,6,3,7,8,2,67,95};
        boolean ans = check(arr);
        System.out.println(ans);
    }
}
