package F_OOP.constructor;

public class no_argument {
    public static void main(String[] args) {
        student s = new student();
        s.show();
    }
}
class student{
    int roll_no;
    String name;
    student(){
        roll_no = 15;
        name = "Uday";
    }
    void show(){
        System.out.println("Roll no = " + roll_no);
        System.out.println("Name = " + name );
    }
}
