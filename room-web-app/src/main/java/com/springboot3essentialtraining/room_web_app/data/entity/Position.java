package com.springboot3essentialtraining.room_web_app.data.entity;

public enum Position {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    public String toString() {
        return switch (this) {
            case CONCIERGE -> "Concierge";
            case HOUSEKEEPING -> "Housekeeping";
            case FRONT_DESK -> "Front Desk";
            case SECURITY -> "Security";
        };
    }
}
