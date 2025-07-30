package com.lina.business.business_management.utils;

public enum ModuleApp {
    ACCOUNT_MANAGEMENT("Account Management");

    private String label;
    ModuleApp(String label){
        this.label = label;
    }
    public String getLabel(){
        return label;
    }
}
