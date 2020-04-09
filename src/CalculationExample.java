import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();

        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int sum = x + y;
            int subtraction = x - y;
            int multiple = x * y;
            int division = x / y;
            System.out.println("The sum of x and y is: " + sum);
            System.out.println("The difference of x and y is: " + subtraction);
            System.out.println("Multiplication of x and y: " + multiple);
            System.out.println("Quotient of x and y: " + division);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
