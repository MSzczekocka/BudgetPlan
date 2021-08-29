package pl.budgetplan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Entity is a JPA annotation to make this object ready for storage in a JPA-based data store
@Entity
public class BudgetType {
    private @Id @GeneratedValue int budgetTypeId;
    private String budgetTypeName;

// Constructor for String BudgetTypeName.
    public BudgetType(String budgetTypeName) {
        this.budgetTypeName = budgetTypeName;
    }

// Getters
    public int getBudgetTypeId() {
        return budgetTypeId;
    }

    public String getBudgetTypeName() {
        return budgetTypeName;
    }

// Setters
    public void setBudgetTypeId(int budgetTypeId) {
        this.budgetTypeId = budgetTypeId;
    }

    public void setBudgetTypeName(String budgetTypeName) {
        this.budgetTypeName = budgetTypeName;
    }

// toString
    @Override
    public String toString() {
        return "BudgetType{" +
                "id=" + budgetTypeId +
                ", BudgetTypeName='" + budgetTypeName + '\'' +
                '}';
    }
}
