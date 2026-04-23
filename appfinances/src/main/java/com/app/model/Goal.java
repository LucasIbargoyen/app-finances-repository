package com.app.model;
import java.time.LocalDate;

public class Goal {
    private String title;
    private Double targetAmount;
    private Double currentAmount;
    private LocalDate deadLine;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Double getTargetAmount() {
        return targetAmount;
    }
    public void setTargetAmount(Double targetAmount) {
        this.targetAmount = targetAmount;
    }
    public Double getCurrentAmount() {
        return currentAmount;
    }
    public void setCurrentAmount(Double currentAmount) {
        this.currentAmount = currentAmount;
    }
    public LocalDate getDeadLine() {
        return deadLine;
    }
    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

}
