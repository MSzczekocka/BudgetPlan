package pl.budgetplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BudgetTypeCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        for (BudgetType budgetType: this.budgetTypeRepository.findAll())
        System.out.println(budgetType.toString());
    }
    @Autowired BudgetTypeRepository budgetTypeRepository;
}
