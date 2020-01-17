public class MultipleInheritance implements Interface1,Interface2 {
    @Override
    public void print1() {
        System.out.println("Inside class Print 1");
    }

    @Override
    public void print2() {
        System.out.println("Inside CLass Print 2");

    }

    @Override
    public void print3() {
        System.out.println("Inside class Print 3");
    }

    @Override
    public void print4() {
        System.out.println("Inside class Print 4");
    }

    public static void  main(String[]args){
        Interface1 interface1 = new MultipleInheritance();
        interface1.print1();
        interface1.print2();
       // interface1.print3(); // cannot resolve method
        Interface2 interface2 = new MultipleInheritance();
        interface2.print3();
        interface2.print4();
       // interface2.print1(); // cannot resolve method
    }
}