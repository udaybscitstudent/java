// Java program to insert an element in an array
import java.util.Scanner; //implementing Scanner class
class array_insertion {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);   //creating scanner object   
        int arr[] = new int[20];    //creating array of size 20
        System.out.println("Enter size of array:");  
        int size = obj.nextInt();

       //taking element according to size of array
        System.out.println("Enter "+size+" elements:");
        for(int i=0;i<size;i++){
            arr[i] = obj.nextInt();
        }

        // taking new element or location 
        System.out.println("Enter new element and position:");
        int n = obj.nextInt();
        int l = obj.nextInt();

        for(int i = size-1;i>=l-1;i-- ){
            arr[i+1] = arr[i];
        }
        size++;
        arr[l-1] = n;

        // printing all element 
        System.out.println("All elements are:");
        for(int i=0; i<size;i++){
            System.out.print(arr[i]+" ");
        }

        obj.close();

    }
}
