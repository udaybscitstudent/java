public class majority_element {
    public static void main(String args[]){
        int arr[] = {10,10,10,20,20}; 
        int size = arr.length;
        for(int i=0;i<arr.length;i++){
            int freq=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j])
                    freq++;
            }
            if(freq > size/2){
                System.out.println("majority element="+arr[i]);
                break ;
            }
        }
    }
}
