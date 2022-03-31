package com.devsuperior.aulaspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    @Autowired
    private TaxService taxService;

    @Autowired
    private PensionService pensionService;

    public SalaryService(GeorgiaTaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(double grossSalary) {
        return grossSalary - taxService.tax(grossSalary) - pensionService.discount(grossSalary);
    }
}