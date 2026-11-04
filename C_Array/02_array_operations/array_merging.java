public class array_merging {
    public static void main(String args[]){
        int arr1[] = {10,20,30,40,50};
        int arr2[] = {60,70,80,90,100};

        // initializing merging array
        int arr[] = new int[arr1.length + arr2.length];

        // copying first array.
        for(int i = 0;i<arr1.length;i++){
            arr[i] = arr1[i];
        }

        //copying second array
        for(int i = 0;i<arr2.length;i++){
            arr[arr1.length+i] = arr2[i];
        }

        System.out.println("After merging 1st array and 2nd array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
