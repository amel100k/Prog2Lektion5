package Opgave04;

public class Opgave04Main {
    public static void main(String[] args) {
        System.out.println("reverse(\"Emil\") = " + reverse2("Emil"));
    }
    public static String reverse(String s) {
        String result = "";
        for (int i = 1; i < s.length() + 1; i++) {
            result += s.charAt(s.length()-i);
        }
        return result;
    }
    public static String reverse2(String s) {
        String result = "";
        if (s.length() <= 0){
            return result;
        }
        result += s.substring(s.length()-1);
        result += reverse2(s.substring(0,s.length()-1));
        return result;
    }
}
