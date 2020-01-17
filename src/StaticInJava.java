public class StaticInJava {

    /*In Java, static keyword is mainly used for memory management.
    It can be used with variables, methods, blocks and nested classes.
    It is a keyword which is used to share the same variable or method of a given class.
    Basically, static is used for a constant variable or a method that is same for every instance of a class.*/
    static{
        int a = 10;
        int b = 20;
        System.out.println("Inside Static");
    }

    public static void main(String[] args){
        System.out.println("Inside MAin");
    }
}
