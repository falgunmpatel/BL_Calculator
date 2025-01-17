import java.util.*;

// Driver class
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.println("Enter the numbers:");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+,-,*,/):");

        char op = sc.next().charAt(0);
        double result = 0;

        switch (op) {
            case '-':
                result = num1 - num2;
                break;
            default:
                System.out.println("You enter wrong input");
        }

        System.out.println("The final result:");
        System.out.println();

        System.out.println(num1 + " " + op + " " + num2
                + " = " + result);
    }
}