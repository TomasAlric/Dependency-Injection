package application.services;

public class SalaryService {

    /*WRONG WAY
    private TaxService taxService = new BrazilTaxService();

    private PensionService pensionService = new PensionService();*/

    //CORRECT WAY
    private TaxService taxService;

    private PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(double grossSalary) {
        return grossSalary - taxService.tax(grossSalary) - pensionService.discount(grossSalary);
    }
}