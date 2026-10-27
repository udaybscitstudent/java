package C_Loops.difficult_pattern;

public class hollow_diamond {
    public static void main(String[] args) {
    int i , j , k , n=10;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                if(k==1 || k==2*i-1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
            }
             
            System.out.println();
        }  
        // second half
        for(i=n-1;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                if(k==1 || k==2*i-1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
             
            System.out.println();
        }    
    }
}

// output of the program
/*

for n=5

     *
    * *
   *   *
  *     *
 *       *
  *     *
   *   *
    * *
     * 


*/