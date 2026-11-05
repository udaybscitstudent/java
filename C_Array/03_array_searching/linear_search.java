import java.util.Scanner;
public class linear_search {
    public static void main(String args[]){

        // creating input object
        Scanner obj = new Scanner(System.in);

        // taking size of the array
        System.out.println("Enter size of the array");
        int size = obj.nextInt();

        // initializing array
        int arr[] = new int[size];
        System.out.println("Enter "+size+" elements:");
        for(int i=0;i<size;i++){
            arr[i] = obj.nextInt();
        }

        // taking searching elements
        System.out.println("Enter searching elements");
        int s = obj.nextInt();

        // checking searhing elements 
        int f=0 , i;
        for(i =0;i<size;i++){
            if(arr[i]==s){
                f=1;
                break;
            }
        }

        // displaying all elelments
        System.out.println("Array elements are:");
        for(int j=0;j<size;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();

        // checking searching found or not
        if(f==1){
            System.out.println("searching found on the "+(i+1)+"th position");
        }
        else{
            System.out.println("Searching not found");
        }

        obj.close();
    }
}
