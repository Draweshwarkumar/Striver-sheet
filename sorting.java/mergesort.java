public class mergesort {
    public static void merge_sort(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int  m = (l+r)/2;
        merge_sort(arr,l,m);
        merge_sort(arr,m+1,r);
        merge(arr,l,m,r);
        
     }
    
    public static void merge(int arr[] , int l,int m,int r){

        int temp[] = new int[r-l+1];
        int left = l;
        int right = m+1;
        int k=0;
        while(left <= m && right <= r){
            if(arr[left]<= arr[right]){
                temp[k] = arr[left];
                left++;
            }
            else{
                temp[k] = arr[right];
                right++;
            }
            k++;
        }
        while(left<= m){
            temp[k] = arr[left];
            left++;
            k++;
        }
        while(right <= r){
            temp[k] = arr[right];
            right++;
            k++;
        }
        for(int i=0;i<temp.length;i++){
            arr[l+i] = temp[i];
        }
       
    }
    public static void main (String [] args){
        int arr[] = {13,2,15,4,19,5,3,45};
        int left = 0;
        int right = (arr.length)-1;
        merge_sort(arr,left,right);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
