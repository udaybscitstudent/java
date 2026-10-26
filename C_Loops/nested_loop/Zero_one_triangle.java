package C_Loops.nested_loop;

public class Zero_one_triangle {
    public static void main(String args[]){
        int i , j , n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

// output of the program
/*
0-1 program
for n=5

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1


*/
