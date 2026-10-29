package General_program.difficult_program;

import java.util.Scanner;
public class matrics_sum {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int r=2, c=3 , i, j;
        // for first matrics
        int a[][] = new int[r][c];
        System.out.println("Enter first matrics[2x3]:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[i][j] = obj.nextInt();
            }
        }

        // for second matrics
        int b[][] = new int[r][c];
        System.out.println("\nEnter second matrics[2x3]");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                b[i][j] = obj.nextInt();
            }
        }

        // sum of matrics
        int sum[][] = new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // print sum of matrics
        System.out.println("\nsum of matrics");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
// enter by user
enter first Matrics
10 20 30
40 50 60

// enter by user
enter second matrics
10 20 30
40 50 60

// output 
sum of matrics
20 40 60
80 100 120




*/
