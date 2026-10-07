import java.util.Scanner;
public class C {
    public void science(){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter 1. for physics");
        System.out.println("Enter 2. for chemistry");
        System.out.println("Enter 3. for math");
        System.out.println("Enter 4. for biology");
        System.out.println("Enter 5. for exit");
        System.out.println("Enter your choice");
        int ch = obj.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Physics");
                break;
            case 2:
                System.out.println("Chemistry");
                break;
            case 3:
                System.out.println("Math");
                break;
            case 4:
                System.out.println("Biology");
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Enter valid choice");
                break;
        }
        obj.close();

    }
    public void s_science(){
        System.out.println("work in process...");
    }
    public static void main(String args[]){

        C val = new C();

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1. for science stream");
        System.out.println("Enter 2. for social science stream");
        System.out.println("Enter your choice");
        int ch = obj.nextInt();
        switch (ch) {
            case 1:
                val.science();break;
            case 2:
                val.s_science();break;
            default:
                System.out.println("Enter valid choice");
                break;
        }
        obj.close();
    }
}
