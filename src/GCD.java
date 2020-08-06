import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        //scanner
        Scanner scan = new Scanner(System.in);
        //first number
        System.out.println("Enter your first number.");
        int first = scan.nextInt();
        //second number
        System.out.println("Thanks,Now enter your second number.");
        int second = scan.nextInt();
        //result of gcd of first num and second num
        int result = gcd(first, second);
        //saying the result
        System.out.println("gcd of " + first + "," + second + " is " + result);
    }

    public static int gcd(int a, int b){
        int min = Math.min(a, b);
        while(min > 0){
            if(a % min == 0 && b % min == 0) {
                return min;
            }
            min--;
        }
        return 1;
    }
}
