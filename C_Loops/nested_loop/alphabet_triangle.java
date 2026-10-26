package C_Loops.nested_loop;

public class alphabet_triangle {
    public static void main(String[] args){
        int i , j ,n=5;
        for(i=1;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print((char)(65+j) + " ");
            }
            System.out.println();
        }
    }
    
}

/* output of the program
for n=5

A
A B
A B C
A B C D
A B C D E 


*/
