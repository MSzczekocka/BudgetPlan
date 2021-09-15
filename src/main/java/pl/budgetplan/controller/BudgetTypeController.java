package pl.budgetplan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.budgetplan.model.BudgetType;
import pl.budgetplan.repository.BudgetTypeRepository;


import java.util.List;

@RestController
public class BudgetTypeController {

  private final BudgetTypeRepository repository;

  BudgetTypeController(BudgetTypeRepository repository){
    this.repository = repository;
  }

  @GetMapping("/employees")
  List<BudgetType> all() {
    return repository.findAll();
  }

}
