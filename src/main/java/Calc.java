import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        add();
    }

    public static void add(){
        System.out.printf("Enter First Number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNum = inputs.nextInt();

        System.out.printf("Enter Second Number: ");
        int secondNum = inputs.nextInt();

        int total = firstNum + secondNum;
        System.out.printf("The total is: " + total);

             sub();
    }

    public static void sub()
    {
        System.out.printf("Please your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.printf("Please your Second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("Total is "+ total);
        divide();
    }

    public static void divide()
    {
        System.out.printf("Please your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.printf("Please your Second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber / secondNumber;
        System.out.printf("Total is "+ total);
    }
}
