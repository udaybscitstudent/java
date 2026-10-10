package C_Loops.nested_loop;

public class inverted_right_angle_triangle {
    public static void main(String args[]){
        int i , j;
        for(i=1;i<=5;i++){
            for(j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int k=5-i;k>=0;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
output of the program

* * * * *
  * * * *
    * * *
      * *
        * 

*/
