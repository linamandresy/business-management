package com.lina.business.business_management.utils;

public enum StockMovementType {
    IN("IN"),
    OUT("OUT"),
    TRANSFER("TRANSFER");

    private final String value;

    StockMovementType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static StockMovementType fromValue(String value) {
        for (StockMovementType type : StockMovementType.values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown stock movement type: " + value);
    }

    @Override
    public String toString() {
        return value;
    }
}
