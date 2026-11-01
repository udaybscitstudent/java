package F_OOP.constructor;

class default_constructor {
    int a ;
    float b;
    String c;
    public static void main(String[] args) { 
        
        default_constructor obj = new default_constructor();
        System.out.println("Default value of int a = " + obj.a);
        System.out.println("Default value of float b = " + obj.b);
        System.out.println("Default value of String c = " + obj.c);
    }
}

