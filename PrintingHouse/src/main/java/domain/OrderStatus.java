package domain;

public enum OrderStatus {
    NOT_CONFIRMED,
    CONFIRMED,
    PAID,
    IN_EXECUTION,
    READY_FOR_DELIVERING,
    DELIVERING,
    DELIVERED,
    DELIVERED__CONFIRMED
}