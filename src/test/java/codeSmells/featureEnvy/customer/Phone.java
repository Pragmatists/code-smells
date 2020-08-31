package codeSmells.featureEnvy.customer;

class Phone {
    private final String unformattedNumber;
    Phone(String unformattedNumber) {
        this.unformattedNumber = unformattedNumber;
    }
    String getAreaCode() {
        return unformattedNumber.substring(0, 3);
    }
    String getPrefix() {
        return unformattedNumber.substring(3, 6);
    }
    String getNumber() {
        return unformattedNumber.substring(6, 10);
    }
    public String getMobilePhoneNumber() {
        return "(" +
                getAreaCode() + ") " +
                getPrefix() + "-" +
                getNumber();
    }
}
