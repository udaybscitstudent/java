public class second_largest {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,70,80};
        int large = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        
        int sl = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > sl && arr[i] != large ){
                sl=arr[i];
            }
        }

        System.out.println("largest element="+large);
        System.out.println("Second largest element="+sl);

    }
}
