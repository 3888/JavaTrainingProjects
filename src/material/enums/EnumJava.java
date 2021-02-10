package material.enums;

public enum EnumJava {
    VALUE_ONE("first"),
    VALUE_TWO("second");

    private final String valueString;

    EnumJava(String value) {
        this.valueString = value;
    }

    public String getValue() {
        return valueString;
    }

}