import java.util.Scanner;
public class binary_search {
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

        int i=0 , j=size-1 , mid=0 , f=0;
        while(i<=j){
            mid = (i+j)/2;
            if(arr[mid]==s){
                f=1;
                break;
            }
            else if(arr[mid]<s){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }

        // displaying all elelments
        System.out.println("Array elements are:");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // checking searching found or not
        if(f==1){
            System.out.println("searching found on the "+(mid+1)+"th position");
        }
        else{
            System.out.println("Searching not found");
        }

        obj.close();
    }
}
