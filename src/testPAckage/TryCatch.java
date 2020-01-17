package testPAckage;

public class TryCatch {

    public static int a;
    public static int b;

    public static void main(String[]args){
        a =10;
        b=0;

        //System.out.println("asfasdf");

        try{
            int c = a/b;
            System.out.println("try");
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }
}
