import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
             sub();
    }

    public static void sub()
    {
        System.out.println("Please your first number");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your Second number");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("Total is "+ total);
    }
}
