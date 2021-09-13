package pl.budgetplan;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BudgetType {
    @Id
    @GeneratedValue
    private int idBudgetType;
    @Value("Main Account")
    private String nameBudgetType;

    public BudgetType(String nameBudgetType) {
        super();
        this.nameBudgetType = nameBudgetType;
    }

    public BudgetType(){
    }


    public int getIdBudgetType() {
        return idBudgetType;
    }

    public String getNameBudgetType() {
        return nameBudgetType;
    }

    public void setIdBudgetType(int idBudgetType) {
        this.idBudgetType = idBudgetType;
    }

    public void setNameBudgetType(String nameBudgetType) {
        this.nameBudgetType = nameBudgetType;
    }

    @Override
    public String toString() {
        return "BudgetType{" +
                "idBudgetType=" + idBudgetType +
                ", nameBudgetType='" + nameBudgetType + '\'' +
                '}';
    }
}
