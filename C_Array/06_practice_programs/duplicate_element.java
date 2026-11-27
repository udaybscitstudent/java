public class duplicate_element {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,10,60,70,20};
        System.out.print("Duplicate elements = ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
