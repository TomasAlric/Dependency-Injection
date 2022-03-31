package application;

import application.services.PensionService;
import application.services.SalaryService;
import application.services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        /*WRONG WAY
        SalaryService salaryService = new SalaryService(); */

        //CORRECT WAY
        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();

        SalaryService salaryService = new SalaryService(taxService, pensionService);

        System.out.println("Enter the net salary: ");
        double grossSalary = scan.nextDouble();

        double netSalary = salaryService.netSalary(grossSalary);
        System.out.printf("Net salary = %.2f%n", netSalary);

        scan.close();
    }
}