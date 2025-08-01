package com.lina.business.business_management.utils;

public enum ResourceType {
    CONSUMABLE,
    SERVICE,
    PRODUCT;

    public String getLabel() {
        switch (this) {
            case CONSUMABLE:
                return "Consumable";
            case SERVICE:
                return "Service";
            case PRODUCT:
                return "Product";
            default:
                return "Unknown";
        }
    }
}
