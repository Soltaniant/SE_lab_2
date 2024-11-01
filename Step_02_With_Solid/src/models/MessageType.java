package models;

public enum MessageType {

    SMS,
    EMAIL,
    TELEGRAM;

    public static MessageType fromOrdinal(int ordinal) {
        if (ordinal > values().length)
            throw new IllegalArgumentException("Invalid message type");
        return values()[ordinal - 1];
    }
}
