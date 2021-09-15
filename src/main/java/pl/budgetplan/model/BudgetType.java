package pl.budgetplan.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Getter
@Setter
@Entity
public class BudgetType {

    private
    @Id
    @GeneratedValue
    int idBudgetType;
    private String nameBudgetType;

    BudgetType() {}

    public BudgetType(String nameBudgetType) {
        this.nameBudgetType = nameBudgetType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                    "idBudgetType=" + idBudgetType +
                    ", nameBudgetType='" + nameBudgetType + '\'' +
                    '}';
    }
}
