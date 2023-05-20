import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PascalsTriangle {

    private static final Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Give an n= ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPascIterative(n);
        printPasc(n);
        printPascRecursive(n);
        printPascMemoization(n);


    }
    public static int fact(int a){
        if(a==0){
            return 1;
        }
        return (a * fact(a-1));
    }

    //The common iterative way
    public static void printPascIterative(int n){
        for (int i = 0; i < n; i++) {
            int value=1;
            //spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            //nums printing iterative
            for (int j = 0; j <= i; j++) {
                System.out.print(value+ " "); // Format each number with spacing
                value = value * (i - j) / (j + 1); // Calculate next number
            }
            System.out.println();
        }
    }

    //my way of doing things
    public static void printPasc(int n) {
        //rows
        for (int i = 0; i < n; i++) {

            //spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            //nums
            for (int j = 0; j <= i; j++) {
                System.out.print(fact(i) / (fact((i - j)) * fact(j)) + " ");
            }
            System.out.println();
        }
    }

    //Using recursion to solve the problem
    public static void printPascRecursive(int n) {
        //rows
        for (int i = 0; i < n; i++) {

            //spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            //nums printing
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalCalc(i, j) + " ");
            }
            System.out.println();
        }
    }

    //calculating the pascal values for the triangle pattern
    public static int pascalCalc(int i, int j){
        if (j == 0 || j == i) {
            return 1;
        }
            return pascalCalc(i - 1, j - 1) + pascalCalc(i - 1, j);
    }

    //Using memoization to optimize for efficiency
    public static void printPascMemoization(int n) {
        //rows
        for (int i = 0; i < n; i++) {

            //spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            //nums
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalCalcMemoization(i, j) + " ");
            }
            System.out.println();
        }
    }
    //calculating the pascal values for the triangle pattern with memoization
    public static int pascalCalcMemoization(int i, int j){
        if (j == 0 || j == i) {
            return 1;
        }

        if (cache.containsKey(i+j)) {
            return cache.get(i+j);
        }

        int result = pascalCalc(i - 1, j - 1) + pascalCalc(i - 1, j);
        cache.put(i-j, result);

        return result;
    }


}

