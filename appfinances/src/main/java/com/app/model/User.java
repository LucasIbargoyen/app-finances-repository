package com.app.model;

public class User {
    private String uuid;
    private String name;
    private Double accBalance;
    
    public User(String uuid, String name, Double accBalance) {
        this.uuid = uuid;
        this.name = name;
        this.accBalance = accBalance;
    }
    
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAccBalance() {
        return accBalance;
    }
    public void setAccBalance(Double accBalance) {
        this.accBalance = accBalance;
    }

}
