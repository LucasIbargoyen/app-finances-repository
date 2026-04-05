package com.app.model;

import java.time.LocalDate;

import com.app.model.enums.TransactionType;

public class Transaction {
    private String uuid;
    private String description;
    private Double amount;
    private LocalDate date;
    private TransactionType type;
    private Category category;
    
}
