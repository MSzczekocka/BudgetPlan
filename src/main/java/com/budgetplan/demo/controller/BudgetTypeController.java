package com.budgetplan.demo.controller;

import com.budgetplan.demo.entity.BudgetType;
import com.budgetplan.demo.service.BudgetTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// @RestController allow use GetMapping etc
@RequiredArgsConstructor
//@RequiredArgsConstructor == @Autowired + Constructor
public class BudgetTypeController {
    private final BudgetTypeService budgetTypeService;

    @GetMapping("/budget-types")
    public List<BudgetType> getBudgetTypes(){
        return budgetTypeService.getBudgetTypes();
    }

    @GetMapping("/budget-types/{idBudgetType}")
    public BudgetType getBudgetType(@PathVariable int idBudgetType){
        return budgetTypeService.getBudgetType(idBudgetType);
    }
}
