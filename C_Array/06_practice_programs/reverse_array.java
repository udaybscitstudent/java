/**
 * reverse_array
 */
public class reverse_array {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60,70,80};
        int i = 0 , j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("Reverse array");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}