package pl.budgetplan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BudgetType {
    @Id
    @GeneratedValue
    private int idBudgetType;
    private String nameBudgetType;

// Constructor
    public BudgetType(String nameBudgetType) {
        super();
        this.nameBudgetType = nameBudgetType;
    }

    public BudgetType(){
    }

// Getters
    public int getIdBudgetType() {
        return idBudgetType;
    }

    public String getNameBudgetType() {
        return nameBudgetType;
    }
// Setters
    public void setIdBudgetType(int idBudgetType) {
        this.idBudgetType = idBudgetType;
    }

    public void setNameBudgetType(String nameBudgetType) {
        this.nameBudgetType = nameBudgetType;
    }
// to String

    @Override
    public String toString() {
        return "BudgetType{" +
                "idBudgetType=" + idBudgetType +
                ", nameBudgetType='" + nameBudgetType + '\'' +
                '}';
    }
}
