package pl.budgetplan.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.budgetplan.model.BudgetType;

import java.util.List;

@Repository
public interface BudgetTypeRepository extends JpaRepository<BudgetType, Integer>{
    List<BudgetType> findAllByPostIdIn(List<Integer> ids);
}
