public class palindrome_array{
    public static void main(String args[]){
        int arr[] = {10,20,30,20,10};
        int i=0 , j= arr.length-1;
        boolean palindrome = true;
        while(i<j){
            if(arr[i]!=arr[j]){
                palindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(palindrome==true){
            System.out.println("Array is palindrome");
        }
        else{
            System.out.println("Array is not palindrome");
        }
    }
}