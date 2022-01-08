/**
 * recursion
 */
public class recursion {

    public static void main(String[] args) {
        fun(5);
    }

    private static void fun(int n) {
        if(n<=0)   //Base condition or termination condition
        return;
        System.out.println("Hello "+n);
        fun(n-1);
    }
}