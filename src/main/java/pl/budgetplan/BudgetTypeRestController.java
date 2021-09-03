package pl.budgetplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class BudgetTypeRestController {
    @Autowired
    BudgetTypeRepository budgetTypeRepository;

    @RequestMapping("/budgettypes")
    Collection<BudgetType> budgetTypes(){
        return this.budgetTypeRepository.findAll();
    }
}