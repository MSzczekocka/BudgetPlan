package pl.budgetplan;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BudgetTypeRepository extends JpaRepository<BudgetType, Integer> {
    Collection<BudgetType> findNameBudgetType(String nameBudgetType);
}