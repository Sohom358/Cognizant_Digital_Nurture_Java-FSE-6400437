import java.util.Scanner;

public class test {

    public static double futureValueRecursive(double currentValue, double rate, int years) {
        if (years == 0)
            return currentValue;
        return futureValueRecursive(currentValue, rate, years - 1) * (1 + rate);
    }

    
    public static void display(double currentValue, double rate, int years) {
        System.out.println("\nYear-wise Forecast (Recursive):");
        for (int i = 1; i <= years; i++) {
            double value = futureValueRecursive(currentValue, rate, i);
            System.out.printf("Year %d: %.2f\n", i, value);
        }
    }

    public static void main(String[] args) {
        System.out.println("\nFinancial Forecasting System\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current value : ");
        double currentValue = sc.nextDouble();

        System.out.print("Enter annual growth rate (Ignore the %): ");
        double rate = sc.nextDouble();
        rate=rate/100;

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double resultRec = futureValueRecursive(currentValue, rate, years);
        System.out.printf("\nFinal Future Value (Recursive): %.2f\n", resultRec);
        display(currentValue, rate, years);

        sc.close();
    }
}
