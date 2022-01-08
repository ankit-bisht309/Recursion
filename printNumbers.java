public class printNumbers {
    public static void main(String[] args) {
       
        print1toN(5); //print nmbers from 1 to N
        System.out.println();
        printNto1(5); //print numbers from N to 1
    }

    private static void printNto1(int n) {
        if(n==0)
        return;
        System.out.print(n+" ");
        printNto1(n-1);
    }

    private static void print1toN(int N) {
        if(N==0)
        return;
        print1toN(N-1);
        System.out.print(N+" "); 
    }  
}
