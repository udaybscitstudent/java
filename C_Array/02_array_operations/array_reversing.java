import java.util.Scanner;
public class array_reversing {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = obj.nextInt();
        
        int arr[] = new int[size];

        System.out.println("Enter "+size+" Elements:");
        for(int i=0;i<size;i++){
            arr[i] = obj.nextInt();
        }

        int i=0,j=size-1;
        while(i<j){
            int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
        }

        System.out.println("All Elements after reversing:");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        obj.close();
    }
}
