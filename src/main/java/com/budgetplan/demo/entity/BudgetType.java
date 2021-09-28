package com.budgetplan.demo.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class BudgetType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBudgetType;
    private String nameBudgetType;


    public BudgetType(String nameBudgetType) {
        this.nameBudgetType = nameBudgetType;
    }
}

