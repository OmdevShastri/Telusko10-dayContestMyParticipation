import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println("Give an n= ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][] arr;
        //rows
        for (int i = 0; i <= n; i++) {
            //spaces
            for (int j = 0; j <=n-i; j++) {
                System.out.print(" ");
            }
            //nums just printing
            for (int j=0;j<=i;j++){
                System.out.print(fact(i)/(fact((i-j))*fact(j)) + " ");
            }
            System.out.println();
        }

    }
    public static int fact(int a){
        if(a==1){
            return 1;
        }
        return a * fact(a-1);
    }

}

