import java.util.Scanner;

public class Main {
    //main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to calculate factorial of: ");
        int num = sc.nextInt();
        int result =0;

        result = fact(num);
        System.out.println(result);
    }

    //method to calculate our factorial
    public static int fact (int num){
//        int value=1;
//        for (int i = 1; i <= num; i++) {
//            value = value*i;
//        }

        if (num == 1) {
            return 1;
        }
        //The recursion part
        return num*fact(num-1);
    }
}