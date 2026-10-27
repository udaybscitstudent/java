package F_OOP.constructor;

public class parameterized_constructor {
    public static void main(String args[]){
        student obj = new student(15 , "uday");
        System.out.println(obj.name);
    }
}

class student{
    int id;
    String name;
    student(int id , String name){
        this.id = id;
        this.name = name;
    }
}