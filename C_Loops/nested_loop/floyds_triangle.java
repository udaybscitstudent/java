package C_Loops.nested_loop;
public class floyds_triangle {
    public static void main(String[] args){
        int i , j, k=1,n=5;
        for(i=1;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}

//floyd's triangle
/*
output of the program

for n=5;

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


*/
