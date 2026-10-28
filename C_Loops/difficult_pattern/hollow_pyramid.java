// package C_Loops.difficult_pattern;

public class hollow_pyramid {
    public static void main(String args[]){
        int i , j , k , n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                if(k==1 || k==2*i-1 || i==n){
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

/*
output of the program

    *
   * *
  *   *
 *     *
*********


*/
