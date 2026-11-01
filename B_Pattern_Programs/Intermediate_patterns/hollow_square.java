package B_Pattern_Programs.Intermediate_patterns;  //it is not compulsory

public class hollow_square {
    public static void main(String args[]){
        int i , j, n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
Hollow square

outpute of the program

*****
*   *
*   *
*   *   
*****



*/
