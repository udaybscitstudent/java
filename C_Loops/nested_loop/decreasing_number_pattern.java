package C_Loops.nested_loop;

public class decreasing_number_pattern {
    public static void main(String args[]){
        int i , j;
        for(i=0;i<5;i++){
            for(j=1;j<=5-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*output
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/