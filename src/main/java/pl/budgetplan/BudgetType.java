package pl.budgetplan;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class BudgetType {
    @Id
    @GeneratedValue
    private int idBudgetType;
    private String nameBudgetType;

    public BudgetType(String nameBudgetType) {
        super();
        this.nameBudgetType = nameBudgetType;
    }

    public BudgetType(){
    }


    @Override
    public String toString() {
        return "BudgetType{" +
                "idBudgetType=" + idBudgetType +
                ", nameBudgetType='" + nameBudgetType + '\'' +
                '}';
    }
}
