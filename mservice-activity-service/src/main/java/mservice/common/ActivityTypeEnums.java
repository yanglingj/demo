package mservice.common;

import java.util.Arrays;

public enum ActivityTypeEnums {
    RADIO((byte) 1, "收音机");

    byte type;
    String name;

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ActivityTypeEnums(byte type, String name) {
        this.type = type;
        this.name = name;
    }

    public static ActivityTypeEnums getByType(byte type) {
        return Arrays.stream(ActivityTypeEnums.values())
                .filter(activityTypeEnums -> activityTypeEnums.getType() == type)
                .findFirst()
                .get();
    }
}
