public class selection_sort {
    public static void main(String args[]){
        int arr[] = {10,20,15,5,8};
        int i ,j , min;
        boolean flag= false;
        for(i=0;i<arr.length;i++){
            min=i;
            for(j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                    flag=true;
                }
            }
            if(flag==true){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
