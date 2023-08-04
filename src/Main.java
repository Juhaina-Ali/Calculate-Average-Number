import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter first number ");
        double num1 = read.nextDouble();
        System.out.println("Enter second number ");
        double num2 = read.nextDouble();
        System.out.println("Enter third number ");
        double num3 = read.nextDouble();

        double avg = (num1 + num2 + num3)/3;
        System.out.println("The average number = "+avg);

    }
}