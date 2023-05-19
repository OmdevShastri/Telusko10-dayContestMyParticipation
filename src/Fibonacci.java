import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {

    private static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a position in the fibo series:  ");
        int pos= sc.nextInt();

        int result =fib(pos);
        System.out.println("Non-recursion");
        System.out.println(result);

        //calling recursion method
        System.out.println("Using recursion");
        System.out.println(fibRec(pos));

        //calling recursion with Cache method
        System.out.println("Using recursion with Cache method");
        System.out.println(fibRecCache(pos));
    }
    public static int fib(int pos){
        int a = 0;
        int b = 1;
        int c = 0;
        //0 1 1 2 3 5 8 13 21
          //a b c (positions)

        for (int i = 2; i <= pos; i++) {
            c = a+b;
            a=b;
            b=c;

        }
        return c;
    }

    //using recursion
    public static int fibRec(int pos){
        if (pos==0){
            return 0;
        }
        if (pos == 1 || pos ==2) {
            return 1;
        }
        return fibRec(pos-1)+fibRec(pos-2);
    }

    //using recursion plus cache system
    public static int fibRecCache(int pos){
        if (pos==0){
            return 0;
        }
        if (pos == 1 || pos ==2) {
            return 1;
        }
        if (cache.containsKey(pos)) {
            return cache.get(pos);
        }

        int result = fibRecCache(pos-1)+fibRecCache(pos-2);
        cache.put(pos, result);

        return result;
    }
}
