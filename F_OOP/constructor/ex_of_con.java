// ex:- write a program to take a number and compute the square of that number by using parameter constructor.
package F_OOP.constructor;  //it is not compulsary 

public class ex_of_con {
    public static void main(String args[]){
        number n = new number(10);
        int s = n.square();
        System.out.println("Square = "+s);
        
    }
}
class number{
    int n;
    number(int n){
        this.n = n;
    }
    int square(){
        return n*n;
    }

}
