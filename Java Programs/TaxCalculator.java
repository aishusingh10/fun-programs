import java.util.*;

class TaxCalculator {

    public static void main(final String[] args) {
        System.out.println("Hello, World!");
        double salary;
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        salary = sc.nextDouble();
        final double computedTax = computeTax(salary);

        System.out.println("Computed tax is " + computedTax);
        sc.close();
    }

    public static double computeTax(final double totalIncome) {

        double computedTax = 0;

        if (totalIncome >= 0 && totalIncome <= 350000) {
            computedTax = 0;

        } else if (totalIncome >= 350001 && totalIncome <= 625000) {

            computedTax = (totalIncome - 350000) * 0.09;

        } else if (totalIncome >= 625001 && totalIncome <= 1200000) {
            final double tax1 = (totalIncome - 625000) * 0.18;
            final double tax2 = (275000) * 0.09;
            computedTax = tax1 + tax2;
        } else {
            final double tax1 = (totalIncome - 120000) * 0.35;
            final double tax2 = (575000) * 0.18;
            final double tax3 = (275000) * 0.09;

            computedTax = tax1 + tax2 + tax3;
        }

        return computedTax;
    }
}