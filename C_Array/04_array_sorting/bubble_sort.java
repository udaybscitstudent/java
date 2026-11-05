import java.util.Scanner;
public class bubble_sort {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int arr[] = {10,80,05,60,30};

        int i, j , temp;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("All elements are:");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        obj.close();
    }
}
