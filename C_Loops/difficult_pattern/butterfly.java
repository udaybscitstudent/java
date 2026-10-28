// package C_Loops.difficult_pattern;

public class butterfly {
    public static void main(String args[]){
        int i , j , k ,l, n =20;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(k=i+1;k<=4*n-3*i;k++){
                System.out.print(" ");
            }
            for(l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // second half
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            for(k=n-i+1;k<=n+3*i;k++){
                System.out.print(" ");
            }
            for(l=1;l<=n-i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*output of the program

for n=10

*                                     * 
* *                                 * * 
* * *                             * * * 
* * * *                         * * * * 
* * * * *                     * * * * * 
* * * * * *                 * * * * * * 
* * * * * * *             * * * * * * * 
* * * * * * * *         * * * * * * * * 
* * * * * * * * *     * * * * * * * * * 
* * * * * * * * * * * * * * * * * * * * 
* * * * * * * * *     * * * * * * * * * 
* * * * * * * *         * * * * * * * * 
* * * * * * *             * * * * * * * 
* * * * * *                 * * * * * * 
* * * * *                     * * * * * 
* * * *                         * * * * 
* * *                             * * * 
* *                                 * * 
*                                     *


*/



/* 
// program without space

public static void main(String args[]){
        int i , j , k ,l, n =10;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(k=i+1;k<=2*n-i;k++){
                System.out.print(" ");
            }
            for(l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(k=n-i+1;k<=n+i;k++){
                System.out.print(" ");
            }
            for(l=1;l<=n-i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        // output of the program
        for n=5
        *       *
        **     **
        ***   ***
        **** ****
        *********
        **** ****
        ***   ***
        **     **
        *       *
*/

