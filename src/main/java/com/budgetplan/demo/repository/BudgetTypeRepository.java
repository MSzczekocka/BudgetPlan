package com.budgetplan.demo.repository;

import com.budgetplan.demo.entity.BudgetType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//allow get data form database
@Repository
//JPARepository<Entity,ID>
public interface BudgetTypeRepository extends JpaRepository<BudgetType, Integer> {
// adding this interface giving default methods from JpaRepository
}
