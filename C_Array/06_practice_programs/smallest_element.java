import java.util.Scanner;
public class smallest_element {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int size=5;
        int arr[] = new int[size];
        System.out.println("Enter "+size+" elements:");
        for(int i=0;i<size;i++){
            arr[i] = obj.nextInt();
        }
        int sm = arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]<sm){
                sm=arr[i];
            }
        }
        System.out.println("Smallest element of array:"+sm);
        obj.close();
    }
}
