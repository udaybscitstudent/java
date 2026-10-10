package C_Loops.nested_loop;

public class right_triangle {
    public static void main(String args[]){
        int i , j;
        for(i=1;i<=5;i++){
            for(j=5-i;j>=1;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
           System.out.println();
        }
    }
}

/*output of the program

        *
      * *
    * * *
  * * * *
* * * * *

*/
