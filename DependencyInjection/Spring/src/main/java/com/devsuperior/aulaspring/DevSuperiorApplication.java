package com.devsuperior.aulaspring;

import com.devsuperior.aulaspring.services.SalaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevSuperiorApplication implements CommandLineRunner {

    private SalaryService salaryService;

    public DevSuperiorApplication(SalaryService salaryService){
        this.salaryService = salaryService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DevSuperiorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(salaryService.netSalary(4000.0));
    }
}
