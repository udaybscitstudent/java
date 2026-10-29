package General_program.difficult_program;

public class pascal_triangle {
    public static void main(String args[]){
        int i , j ,k, n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int num=1;
            for(k=1;k<=i;k++){
                System.out.print(num+" ");
                num = num*(i-k)/k;
            }
            System.out.println();
        }
    }
}

// output of the program
/*
for n=5;

    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

*/
