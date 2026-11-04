import java.util.Scanner;
public class array_deletion {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        int arr[] = new int[20];
        System.out.println("Enter size of array:");
        int size = obj.nextInt();
        System.out.println("Enter "+size+" Elements:");
        for(int i=0;i<size;i++){
            arr[i] = obj.nextInt();
        }

        System.out.println("Enter position for deletion:");
        int p = obj.nextInt();
        System.out.println("Deleted element is: "+arr[p-1]);
        for(int i=p-1;i<size;i++){
            arr[i] = arr[i+1];
        }
        size--;
        System.out.println("All elements are:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        obj.close();

    }
}
