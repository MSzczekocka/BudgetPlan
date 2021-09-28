package com.budgetplan.demo.service;

import com.budgetplan.demo.entity.BudgetType;
import com.budgetplan.demo.repository.BudgetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetTypeService {

    private final BudgetTypeRepository budgetTypeRepository;

    @Autowired
    public BudgetTypeService(BudgetTypeRepository budgetTypeRepository) {
        this.budgetTypeRepository = budgetTypeRepository;
    }

    public List<BudgetType> getBudgetTypes(){
        return budgetTypeRepository.findAll();
    }

    public BudgetType getBudgetType(int idBudgetType){
        return budgetTypeRepository.getById(idBudgetType);
    }
}
