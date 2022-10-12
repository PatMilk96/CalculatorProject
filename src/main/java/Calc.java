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
    }
}
