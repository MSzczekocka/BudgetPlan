package pl.budgetplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class BudgetTypeRestController {

    @RequestMapping("/budgettypes")
    Collection<BudgetType> budgetTypes(){
        return this.budgetTypeRepository.findAll();
    }

    @Autowired
    BudgetTypeRepository budgetTypeRepository;
}