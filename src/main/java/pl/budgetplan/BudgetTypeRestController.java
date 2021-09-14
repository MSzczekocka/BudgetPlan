package pl.budgetplan;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@AllArgsConstructor
public class BudgetTypeRestController {
    @Autowired
    private final BudgetTypeRepository budgetTypeRepository;

    @GetMapping("/budget-types")
    public List<BudgetType> getBudgetTypes(){
        return this.budgetTypeRepository.findAll();
    }

    @GetMapping("/budget-types/{idBudgetType}")
    public BudgetType getSingleBudgetType(@PathVariable int idBudgetType){
        return null;
    }
}