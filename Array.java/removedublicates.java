// package Array.java;

public class removedublicates {
    public static int remove(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main (String[] args){
        int arr[] = {1,1,12,2,2,3,3,4,4,6,5,5,7,7};
        int ans = remove(arr);
        for(int i=0;i<ans;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Length" + ans);
    }
}
