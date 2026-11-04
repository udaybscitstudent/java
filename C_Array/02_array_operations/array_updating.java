import java.util.Scanner;
public class array_updating {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        // taking size of array
        System.out.println("Enter size of array:");
        int size = obj.nextInt();

        // initilizating array
        int arr[] = new int[size];

        // taking element input 
        System.out.println("Enter "+size+" elements");
        for(int i=0;i<size;i++){
            arr[i] = obj.nextInt();
        }

        System.out.println("Enter new element and position:");
        int newElement = obj.nextInt();
        int position = obj.nextInt();

        // updating array of element at given position
        arr[position-1] = newElement;

        // displaying all element after updating
        System.out.println("All element after updating");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        obj.close();
    }
}
