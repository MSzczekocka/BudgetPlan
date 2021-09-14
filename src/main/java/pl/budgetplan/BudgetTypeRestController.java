package pl.budgetplan;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
public class BudgetTypeRestController {
    @Autowired
    private final BudgetTypeRepository budgetTypeRepository;

    @GetMapping("/budgettypes")
    @ResponseBody
    public Collection<BudgetType> budgetTypes(){
        return this.budgetTypeRepository.findAll();
    }
}