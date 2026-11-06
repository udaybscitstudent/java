public class largest_element {
    public static void main(String args[]){
        int arr[] = {110,550,60,89,220,900,100};
        int large = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        System.out.println("largest element="+large);
    }
    
}
