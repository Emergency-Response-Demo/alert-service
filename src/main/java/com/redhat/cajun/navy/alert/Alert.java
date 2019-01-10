package com.redhat.cajun.navy.alert;

import java.util.Objects;

public class Alert {

    private AlertType type;
    private String message;

    Alert(AlertType type, String message) {
        this.type = type;
        this.message = message;
    }

    public AlertType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alert alert = (Alert) o;
        return type == alert.type &&
                Objects.equals(message, alert.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, message);
    }

    @Override
    public String toString() {
        return "Alert{" +
                "type=" + type +
                ", message='" + message + '\'' +
                '}';
    }
}
