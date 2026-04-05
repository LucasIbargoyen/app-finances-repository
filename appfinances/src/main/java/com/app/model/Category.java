package com.app.model;

public class Category {
    private String name;
    private String icon;
    private Double budgetLimit;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public Double getBudgetLimit() {
        return budgetLimit;
    }
    public void setBudgetLimit(Double budgetLimit) {
        this.budgetLimit = budgetLimit;
    }

}
