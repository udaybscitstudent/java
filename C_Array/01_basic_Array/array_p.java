public class array_p {
    public static void main(String args[]){
        // int arr[] ;  //array declaration 

        // arr = new int[5]; // array initialization
        int arr[] = {1,2,3,4,5}; // array declaration and direct initialization
        System.out.println("Array elements are:");
        for(int i=0; i<arr.length; i++){   // array length is used to get the size of the array
            System.out.println(arr[i]); // array elements are printed
        }
    }
}
