package C_Loops.nested_loop;

public class number_triangle {
    public static void main(String args[]){
        int i ,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

/*outpute of the program
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/