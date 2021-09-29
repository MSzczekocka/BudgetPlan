package com.budgetplan.demo.service;

import com.budgetplan.demo.entity.BudgetType;
import com.budgetplan.demo.repository.BudgetTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BudgetTypeService {

    private final BudgetTypeRepository budgetTypeRepository;


    public List<BudgetType> getBudgetTypes(){
        return budgetTypeRepository.findAll();
    }

    public BudgetType getBudgetType(int idBudgetType){
        return budgetTypeRepository.getById(idBudgetType);
    }
}
