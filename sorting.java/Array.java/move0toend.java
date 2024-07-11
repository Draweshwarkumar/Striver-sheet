public class move0toend {
    public static void movetoend(int arr[]){
        int j = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                j=i;
                break;
            }
            
        }
        for(int i=j+1;i<arr.length;i++){
            if(j==-1){
                break;
            }
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {23,43,0,54,0,76,6,0,8};
        movetoend(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
