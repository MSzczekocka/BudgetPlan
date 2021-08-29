package pl.budgetplan;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class LoadDataBase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(BudgetTypeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new BudgetType("Basic Account")));
            log.info("Preloading " + repository.save(new BudgetType("Basic Savings")));
            log.info("Preloading " + repository.save(new BudgetType("Investment Account")));
        };
    }
}
