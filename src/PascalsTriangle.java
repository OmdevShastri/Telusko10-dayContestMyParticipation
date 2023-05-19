import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println("Give an n= ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPascRecursive(n);


    }
    public static int fact(int a){
        if(a==0){
            return 1;
        }
        return (a * fact(a-1));
    }

    public static void printPascIterative(int n) {
        //rows
        for (int i = 0; i < n; i++) {

            //spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            //nums printing iterative
            for (int j = 0; j <= i; j++) {
                System.out.print(fact(i) / (fact((i - j)) * fact(j)) + " ");
            }
            System.out.println();
        }
    }
    public static void printPascRecursive(int n) {
        //rows
        for (int i = 0; i < n; i++) {

            //spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            //nums printing iterative
            for (int j = 0; j <= i; j++) {
                System.out.print(fact(i) / (fact((i - j)) * fact(j)) + " ");
            }
            System.out.println();
        }
    }

    public static void printPascMemoization(int n) {
        //rows
        for (int i = 0; i < n; i++) {

            //spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            //nums printing iterative
            for (int j = 0; j <= i; j++) {
                System.out.print(fact(i) / (fact((i - j)) * fact(j)) + " ");
            }
            System.out.println();
        }
    }


}

