package C_Loops.nested_loop;
class pyramid{
    public static void main(String args[]){
        int i , j , k;
        for(i=1;i<=5;i++){
            for(j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//output of the program
/*
for n = 5

     *
    ***
   *****
  *******
 *********

*/