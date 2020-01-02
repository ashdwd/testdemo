import java.util.HashMap;
import java.util.Map;

public class TestDemo {

    public static void main(String [] args){
        //System.out.println( isAnagram("Agra", "raga"));
        String s = "fsdf@,asdf sd_af fa,sdf as'df sa!df sdf?asdf?";
        s = s.replace("?","\\?");
        int token = 1;
        String[] symbol = {" ", "!",",","\\?", "_", ".","'","@" };
        for(int i=0 ; i<symbol.length;i++){
            if(s.indexOf(symbol[i])>=0){
                s = s.replace(symbol[i], "@");
            }
        }
        String[] str =s.split("@");
        System.out.println(str.length);
        for(int i=0 ; i<str.length;i++){
            System.out.println(str[i]);
        }
        System.out.println(System.getProperty("user.name"));

    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toUpperCase();
        b=b.toUpperCase();
        Map<Character,Integer> mapA = new HashMap<>();
        Map<Character,Integer> mapB = new HashMap<>();
        for(int i=0; i<a.length();i++){
            if(mapA.containsKey(a.charAt(i))){
                mapA.put(a.charAt(i), mapA.get(a.charAt(i))+1);
            }else{
                mapA.put(a.charAt(i),1);
            }
            if(mapB.containsKey(b.charAt(i))){
                mapB.put(b.charAt(i), mapB.get(b.charAt(i))+1);
            }else{
                mapB.put(b.charAt(i),1);
            }
        }

        if(mapA.equals(mapB)){
            return true;
        }else{
            return false;
        }
    }

    void Demo1(){
        String A = "hello";
        String B = "world";
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B));
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        StringBuffer result = new StringBuffer(A.length()+B.length()+1);
        result.append(A.substring(0,1).toUpperCase()).append(A.substring(1)).append(" ").append(B.substring(0,1).toUpperCase()).append(B.substring(1));

        System.out.println(result);
    }

    public static void reverseString(){
        String str = "My Name Is Java";
        char[] strChar = str.toCharArray();
        String tempString = str.replace(" ", "");
        char[] tempStringChar = tempString.toCharArray();
        StringBuilder result = new StringBuilder();
        result.reverse();
        int length= str.length();

        int temp = tempString.length() - 1;
        for (int i=0; i<length; i++){
            if(Character.toString(strChar[i]).equalsIgnoreCase(" ")){
                result.append(" ");
            }else {
                if (Character.isUpperCase(strChar[i])) {
                    result.append(Character.toString(tempStringChar[temp]).toUpperCase());
                } else {
                    result.append(Character.toString(tempStringChar[temp]).toLowerCase());
                }
                temp=temp-1;
            }
        }
        System.out.println(str);
        System.out.println(result);
    }
}
