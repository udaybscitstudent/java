package C_Loops.nested_loop;

public class inverted_pyramid {
    public static void main(String args[]){
        int i, j, k , n;
        n=5;
        for(i=0;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=(n-i)*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*output of the program
for n=5

*********
 *******
  *****
   *** 
    *


*/
