package codeSmells.featureEnvy.customer;

class Customer {

    private Phone mobilePhone;

    Customer(Phone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    String getMobilePhoneNumber() {
        return "(" +
                mobilePhone.getAreaCode() + ") " +
                mobilePhone.getPrefix() + "-" +
                mobilePhone.getNumber();
    }

}

