// package C_Loops.difficult_pattern;
public class pattern {
    public static void main(String args[]){
        int i , j ,k , n=10;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                if(i==1){
                    System.out.print("^");
                }
                else if(k==1 && i!=1){
                    System.out.print("/");
                }
                else if(k==2*i-1 && i!=1){
                    System.out.print("\\");
                }
                else if( i==n){
                    System.out.print("_");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // bottom
        for(i=1;i<=n;i++){
            for(k=1;k<=2*n-1;k++){
                if(k==1 || k==2*n-1){
                    System.out.print("|");
                }
                else if(i==n){
                    System.out.print("_");
                }
                else{
                    if((k==(2*n)/3 && i>=n/2) || (k==n+n/2-1 && i>=n/2))
                    {
                        System.out.print("|");
                    }
                    else if((k>=(2*n)/3+1 && i==n/2-1) && (k<= n+n/2-2 && i==n/2-1)){
                        System.out.print("_");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
