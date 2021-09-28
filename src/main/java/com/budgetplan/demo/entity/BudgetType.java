package com.budgetplan.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class BudgetType {
    @Id
    private int idBudgetType;
    private String nameBudgetType;


//    public BudgetType(String nameBudgetType) {
//    }
}

