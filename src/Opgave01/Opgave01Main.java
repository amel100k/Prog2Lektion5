package Opgave01;

public class Opgave01Main {
    public static int factorial(int n) {
        if (n <= 0){
            return 1;
        }
        int result = factorial(n-1);
        return n * result;
    }
}
