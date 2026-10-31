package F_OOP.constructor;

class default_constructor {
    public static void main(String[] args) {
        show obj = new show();
        // System.out.println("Default value of int a = " + obj.a);
        // System.out.println("Default value of float b = " + obj.b);
        // System.out.println("Default value of String c = " + obj.c);
        obj.display();
    }
}

class show{
    int a ;
    float b;
    String c;
    show(){
        //  definition
    }
    void display(){
        System.out.println("Default value of int a = " + a);
        System.out.println("Default value of float b = " + b);
        System.out.println("Default value of String c = " + c);
    }
}



